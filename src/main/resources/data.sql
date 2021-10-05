insert into speaker(speaker_id, brand, store, image_file_name)
values(1, 'Charge', 'JBL', 'Best Buy', 'speak1.jpg');

insert into speaker(speaker_id, brand, store, image_file_name)
values (2, 'Charge 2',  'JBL', 'Best Buy', 'speak2.jpg');

insert into speaker(speaker_id, brand,  store, image_file_name)
values (3, 'Mega-Sound',  'Bose', 'Target', 'speak3.jpg');

insert into speaker(speaker_id, brand, store, image_file_name)
values (4, 'Mega-Sound 2',  'Bose', 'Target', 'speak4.jpg');

insert into speaker(speaker_id, brand, store, image_file_name)
values (5, 'Alpha Lights',  'Glow Sound', 'SpeakerShop.com', 'speak5.jpg');

insert into speaker(speaker_id, brand, store, image_file_name)
values (6, 'Omega Light',  'Glow Sound', 'SpeakerShop.com', 'speak6.jpg');

insert into location(location_id, name, country)
values (1, 'Best Buy', 'USA');

insert into location(location_id, name, country)
values (2, 'Target', 'USA');

insert into location(location_id, name, country)
values (3, 'SpeakerShop.com', 'Canada');

insert into sighting(speaker_id, location_id, buyer_name, count, bought_at)
values(5, 6, 'Speaker Boss 2020', 3, PARSEDATETIME('13 Sep 2020, 05:15', 'dd MMM yyyy, HH:mm'));

insert into sighting(speaker_id, location_id, buyer_name, count, bought_at)
values(1, 4, 'Speaker Boss 2020', 2, PARSEDATETIME('27 Aug 2020, 12:31', 'dd MMM yyyy, HH:mm'));

insert into sighting(speaker_id, location_id, buyer_name, count, bought_at)
values(6, 1, 'Speaker Boss 2020', 1, PARSEDATETIME('03 Sep 2020, 15:07', 'dd MMM yyyy, HH:mm'));

insert into sighting(speaker_id, location_id, buyer_name, count, bought_at)
values(2, 8, 'Speaker Boss 2020', 3, PARSEDATETIME('04 Aug 2020, 13:56', 'dd MMM yyyy, HH:mm'));

insert into sighting(speaker_id, location_id, buyer_name, count, bought_at)
values(3, 7, 'Sound Man', 1, PARSEDATETIME('29 Aug 2020, 11:14', 'dd MMM yyyy, HH:mm'));

insert into sighting(speaker_id, location_id, buyer_name, count, bought_at)
values(2, 9, 'Lights Fan', 1, PARSEDATETIME('16 Aug 2020, 08:43', 'dd MMM yyyy, HH:mm'));

insert into sighting(speaker_id, location_id, buyer_name, count, bought_at)
values(4, 2, 'Lights Fan', 1, PARSEDATETIME('28 Jul 2020, 07:37', 'dd MMM yyyy, HH:mm'));