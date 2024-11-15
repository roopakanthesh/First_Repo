create database tunehub;
use tunehub;
show tables;
select * from user;
select * from song;

select * from playlist;
select * from song_playlists;
select * from playlist_song;
update song set link="https://github.com/roopakanthesh/SongList/raw/main/Lazy%20Laura%20-%20Quincas%20Moreira.mp3" where id=3;
truncate table user;
truncate table song;
drop database tunehub;
update song set link = 'https://github.com/roopakanthesh/SongList/raw/main/sampleaudio.mp3' where id=1;

update user set ispremium=0 where userid="c1e8427e-ed5b-4339-9848-cf16d8f28eb9";
insert into song values(1,'a1','g1','li','n1');
insert into song values(2,'a2','g2','li2','n2');