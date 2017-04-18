START TRANSACTION;

DELETE FROM watches;
DELETE FROM categorizes;
DELETE FROM tags;
DELETE FROM Rating;
DELETE FROM Category;
DELETE FROM Tag;
DELETE FROM Comment;
DELETE FROM Watcher;
DELETE FROM Video;
DELETE FROM Star;


INSERT INTO Star(ID, Name, Profile, Image)
VALUES (1, 'Konstatin Hert', 'Trifft sich mit Profi-Fußballern und spielt Fussball.', 'Bild01.jpg');

INSERT INTO Star(ID, Name, Profile, Image)
VALUES (2, 'Michael Kowalewski', 'Hobby ist Leidenschaft!', 'Bild0Kowalewski.jpg');

INSERT INTO Star(ID, Name, Profile, Image)
VALUES (3, 'Karel Christo', 'Just do it!', 'BildChristo2.jpg');

INSERT INTO Star(ID, Name, Profile, Image)
VALUES (4, 'Marianne Rachi', 'Nur so aus Spaß mit dabei - auf ein gutes Spiel!', 'BildRachi.jpg');


INSERT INTO Video(ID, Name, Duration, Description, ViewCount, URL, IDStar)
VALUES (1, 'ULTIMATIVE FREISTOß CHALLENGE mit LEWANDOWSKI', '4:42',
        'freekickerz vs Robert Lewandowski.'
        , 11285427, 'https://www.youtube.com/watch?v=Jwenm-X4J00', 1);

INSERT INTO Video(ID, Name, Duration, Description, ViewCount, URL, IDStar)
VALUES (2, 'Voll ins Eck!', '1:42',
        'Er nimmt Anlauf, schießt und ... wahnsinns Schuss! '
        , 2, 'https://www.youtube.com/watch?v=Jwenm-X4J30', 2);

INSERT INTO Video(ID, Name, Duration, Description, ViewCount, URL, IDStar)
VALUES (3, 'Foul! Rot und Platzverweis!!!', '2:23',
        'Einfach anschauen, das geht garnicht'
        , 2334, 'https://www.youtube.com/watch?v=Jwenm-SD300', 1);

INSERT INTO Video(ID, Name, Duration, Description, ViewCount, URL, IDStar)
VALUES (4, 'Ultra beschimpft Torwart - Skandal', '0:30',
        'Mein erstes Video hier! Danke für die Klicks!'
        , 91982, 'https://www.youtube.com/watch?v=Jwenm-38D00', 3);


INSERT INTO Watcher(ID, Name)
VALUES (1, 'Uli');

INSERT INTO Watcher(ID, Name)
VALUES (2, 'Peter');

INSERT INTO Watcher(ID, Name)
VALUES (3, 'Chris');

INSERT INTO Watcher(ID, Name)
VALUES (4, 'Marvin');

INSERT INTO Comment(ID, Content, IDVideo, IDWatcher)
VALUES (1, 'Freundlicher Typ dieser Lewandowski.', 1, 1);

INSERT INTO Comment(ID, Content, IDVideo, IDWatcher)
VALUES (2, 'Schwache Leistung - da spiel ich ja besser', 2, 2);

INSERT INTO Comment(ID, Content, IDVideo, IDWatcher)
VALUES (3, 'LOL?', 3, 3);

INSERT INTO Comment(ID, Content, IDVideo, IDWatcher)
VALUES (4, 'Da fehlen mir die Worte', 4, 2);


INSERT INTO Tag(ID, Name)
VALUES (1, 'Fussball');

INSERT INTO Tag(ID, Name)
VALUES (2, 'Nakte Leute auf dem Spielfeld');

INSERT INTO Tag(ID, Name)
VALUES (3, 'Freistoß');

INSERT INTO Tag(ID, Name)
VALUES (4, 'Deutschland');


INSERT INTO Category(ID, Name, PreviewImage)
VALUES (1, 'Sport', 'BildA.jpg');

INSERT INTO Category(ID, Name, PreviewImage)
VALUES (2, 'Essen', 'BildEssen.jpg');

INSERT INTO Category(ID, Name, PreviewImage)
VALUES (3, 'Nachrichten', 'BildNachr.jpg');

INSERT INTO Category(ID, Name, PreviewImage)
VALUES (4, 'Lustiges', 'LOL.jpg');


INSERT INTO Rating(IDStar, StarCount1, StarCount2, StarCount3, StarCount4, StarCount5, IDWatcher)
VALUES (1, 0, 0, 3, 0, 1, 1);

INSERT INTO Rating(IDStar, StarCount1, StarCount2, StarCount3, StarCount4, StarCount5, IDWatcher)
VALUES (2, 0, 2, 0, 0, 1, 2);

INSERT INTO Rating(IDStar, StarCount1, StarCount2, StarCount3, StarCount4, StarCount5, IDWatcher)
VALUES (3, 0, 0, 0, 10, 1, 3);

INSERT INTO Rating(IDStar, StarCount1, StarCount2, StarCount3, StarCount4, StarCount5, IDWatcher)
VALUES (4, 4, 0, 0, 0, 1, 4);


INSERT INTO tags(IDTag, IDVideo)
VALUES (1, 1);

INSERT INTO tags(IDTag, IDVideo)
VALUES (1, 2);

INSERT INTO tags(IDTag, IDVideo)
VALUES (1, 3);

INSERT INTO tags(IDTag, IDVideo)
VALUES (2, 3);


INSERT INTO categorizes(IDCategory, IDVideo)
VALUES (1, 1);

INSERT INTO categorizes(IDCategory, IDVideo)
VALUES (1, 2);

INSERT INTO categorizes(IDCategory, IDVideo)
VALUES (1, 3);

INSERT INTO categorizes(IDCategory, IDVideo)
VALUES (1, 4);


INSERT INTO watches(IDWatcher, IDVideo)
VALUES (1, 2);

INSERT INTO watches(IDWatcher, IDVideo)
VALUES (1, 1);

INSERT INTO watches(IDWatcher, IDVideo)
VALUES (1, 3);

INSERT INTO watches(IDWatcher, IDVideo)
VALUES (4, 1);

commit;
