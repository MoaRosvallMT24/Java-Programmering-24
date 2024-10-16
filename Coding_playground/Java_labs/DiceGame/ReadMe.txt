THE DICEGAME:
Mitt spel är uppbyggt kring två objekt - tärningen och spelaren. Spelet (mainmetoden) hämtar information från användaren för att skapa dessa två objekt, så användaren sedan kan spela spelet. Mainmetoden kallar på spelarens metoder, som i sin tur kallar på tärningens metoder. Både tärningen och spelaren har en del metoder som jag aldrig använder i mainmetoden, så nu i efterhand ser jag inte riktigt poängen med att skapa dem. T.ex. getSides, getName, setScore bl.a.
Kanske kan de komma till användning om en tänker annorlunda än jag gjort.

Spelet går till såhär:
Programmet frågar användaren hur många rundor hen vill spela, hur många sidor spelarens tärning har och vad spelaren vill kallas. 
Utifrån informationen användaren matar in skapar programmet ett spelarobjekt (playerOne) och lägger till en tärning till spelaren. 
Därefter börjar spelet. Spelaren gissar sitt nästa tärningsslag, slår tärningen och får poäng om hen gissat rätt. Detta repeteras så många gånger spelaren önskat.
Efter alla repetitioner får spelaren reda på sin slutpoäng och får en liten gratulation om slutpoängen överstiger 0. 
