/*
Expert System: Webseries Recommendation system
Team members:
3313-Vaishnavi Bhavsar
3330-Prajakta Deokule
*/

start:-write('Webseries Recommendation System').
suggest(W):-
write('Please answer these questions to help us recommend webseries to you'),
write('Languages available are'),nl,
                write('1. English'),nl,
                write('2. Hindi'),nl,
                write('3. Korean'),nl,
                write('4. Spanish'),nl,
                write('5. Ukranian'),nl,
write("Enter language:"), 
read(L), 

write('Platforms available are'),nl,
                write('1. Netflix'),nl,
                write('2. Amazon Prime'),nl,
                write('3. Dice Media'),nl,
                write('4. TVF'),nl,
                write('5. Hotstar'),nl,
write("Enter platform:"), 
read(P),

write('Genres available are'),nl,
                write('1. drama'),nl,
                write('2. comedy'),nl,
                write('3. thriller'),nl,
                write('4. sitcom'),nl,
                write('5. horror'),nl,
                write('5. romance'),nl,
			   write('6.action'),nl,
write("Enter web series genre: "), 
read(G),

write('Actors/Actresses available are'),nl,
                write('1. Jim Sarbh'),nl,
                write('2. Jitendra Kumar'),nl,
                write('3. Naveen Kasturia'),nl,
                write('4. Dhruv Sehgal'),nl,
                write('5. Manoj Vajpayee'),nl,
                write('6. Veer Rajwant Singh'),nl,
                write('7. Park Ji-hu'),nl,
                write('8. Anupam Tripathi'),nl,
                write('9. Josh Radner'),nl,
                write('10. Volodymyr Zelenskyy'),nl,
                write('11. Alvaro Morte'),nl,
                write('12. Jaideep Ahlwat'),nl,
                write('13. Emilia Clarke'),nl,
                write('14. Jennifer Aniston'),nl,
                write('15.Shreya Choudhary'),nl, 
write("Enter the actor or actress:"), 
read(A),

write('Number of seasons available are'),nl,
                write('1'),nl,
                write('2'),nl,
                write('3'),nl,
                write('4'),nl,
                write('5'),nl,
                write('8'),nl,
                write('9'),nl,
                write('10'),nl,
write("Enter the number of seasons:"), 
read(S),

webseries(W,L,P,G,A,S).
webseries('Rockstar Boys',L,P,G,A,S):-(L=2,P=1,G=1,A=1,S=1),!.
webseries('Kota Factory',L,P,G,A,S):-(L=2,P=1,G=1,A=2,S=2),!.
webseries('Aspirants',L,P,G,A,S):-(L=2,P=4,G=1,A=3,S=1),!.
webseries('Little Things',L,P,G,A,S):-(L=2,P=1,G=5,A=4,S=4),!.
webseries('The Family Man',L,P,G,A,S):-(L=2,P=2,G=6,A=5,S=2),!.
webseries('What the Folks!',L,P,G,A,S):-(L=2,P=3,G=1,A=6,S=4),!.
webseries('Paatal Lok',L,P,G,A,S):-(L=2,P=2,G=1,A=12,S=1),!.
webseries('Bandish Bandits',L,P,G,A,S):-(L=2,P=2,G=5,A=15,S=1),!.
webseries('Servant of the people',L,P,G,A,S):-(L=5,P=1,G=2,A=10,S=3),!.
webseries('All of us are dead',L,P,G,A,S):-(L=3,P=1,G=5,A=7,S=2),!.
webseries('Squid Game',L,P,G,A,S):-(L=1,P=1,G=1,A=8,S=1),!.
webseries('F.R.I.E.N.D.S',L,P,G,A,S):-(L=1,P=1,G=4,A=14,S=10),!.
webseries('How I met your mother',L,P,G,A,S):-(L=1,P=1,G=4,A=9,S=10),!.
webseries('Game of Thrones',L,P,G,A,S):-(L=1,P=5,G=3,A=13,S=8),!.
webseries('The money heist',L,P,G,A,S):-(L=4,P=1,G=4,A=11,S=5),!.



/*
Welcome to SWI-Prolog (threaded, 64 bits, version 8.4.2)
SWI-Prolog comes with ABSOLUTELY NO WARRANTY. This is free software.
Please run ?- license. for legal details.

For online help and background, visit https://www.swi-prolog.org
For built-in help, use ?- help(Topic). or ?- apropos(Word).

?- consult("C:\\Users\\User\\Downloads\\webseries.pl").
true.

?- suggest(WebS).
Please answer these questions to help us recommend webseries to youLanguages available are
1. English
2. Hindi
3. Korean
4. Spanish
5. Ukranian
Enter language:1.
Platforms available are
1. Netflix
2. Amazon Prime
3. Dice Media
4. TVF
5. Hotstar
Enter platform:|: 1.
Genres available are
1. drama
2. comedy
3. thriller
4. sitcom
5. horror
5. romance
6.action
Enter web series genre: |: 4.
Actors/Actresses available are
1. Jim Sarbh
2. Jitendra Kumar
3. Naveen Kasturia
4. Dhruv Sehgal
5. Manoj Vajpayee
6. Veer Rajwant Singh
7. Park Ji-hu
8. Anupam Tripathi
9. Josh Radner
10. Volodymyr Zelenskyy
11. Alvaro Morte
12. Jaideep Ahlwat
13. Emilia Clarke
14. Jennifer Aniston
15.Shreya Choudhary
Enter the actor or actress:|: 14.
Number of seasons available are
1
2
3
4
5
8
9
10
Enter the number of seasons:|: 10.

WebS = 'F.R.I.E.N.D.S'.
?- 
|    suggest(WebS).
Please answer these questions to help us recommend webseries to youLanguages available are
1. English
2. Hindi
3. Korean
4. Spanish
5. Ukranian
Enter language:3.
Platforms available are
1. Netflix
2. Amazon Prime
3. Dice Media
4. TVF
5. Hotstar
Enter platform:|: 1.
Genres available are
1. drama
2. comedy
3. thriller
4. sitcom
5. horror
6. romance
7. action
Enter web series genre: |: 5.
Actors/Actresses available are
1. Jim Sarbh
2. Jitendra Kumar
3. Naveen Kasturia
4. Dhruv Sehgal
5. Manoj Vajpayee
6. Veer Rajwant Singh
7. Park Ji-hu
8. Anupam Tripathi
9. Josh Radner
10. Volodymyr Zelenskyy
11. Alvaro Morte
12. Jaideep Ahlwat
13. Emilia Clarke
14. Jennifer Aniston
15.Shreya Choudhary
Enter the actor or actress:|: 7.
Number of seasons available are
1
2
3
4
5
8
9
10
Enter the number of seasons:|: 2.
WebS = 'All of us are dead'.

?- 










