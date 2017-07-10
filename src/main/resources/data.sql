
insert into types (id, name) values (1, 'Новости');
insert into types (id, name) values (2, 'События');
insert into types (id, name) values (3, 'Спецакции');
insert into types (id, name) values (4, 'Официальный текст');
insert into types (id, name) values (5, 'Английский текст');

insert into articles (id, name, typeid) values (1, 'Новость 1', 1);
insert into articles (id, name, typeid) values (2, 'Новость 2', 1);
insert into articles (id, name, typeid) values (3, 'Спецакция 1', 3);
insert into articles (id, name, typeid) values (4, 'Новость 3', 1);
insert into articles (id, name, typeid) values (5, 'Новость 4', 1);
insert into articles (id, name, typeid) values (6, 'Спецакция 2', 3);
insert into articles (id, name, typeid) values (7, 'Новость 5', 1);
insert into articles (id, name, typeid) values (8, 'Официальный текст к новости 2', 4);
insert into articles (id, name, typeid) values (9, 'Официальный текст к новости 4', 4);
insert into articles (id, name, typeid) values (10, 'Английский текст к новости 2', 5);
insert into articles (id, name, typeid) values (11, 'Английский текст к новости 3', 5);

insert into article_link values (2, 8);
insert into article_link values (5, 9);
insert into article_link values (2, 10);
insert into article_link values (4, 11);