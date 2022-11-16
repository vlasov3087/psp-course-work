create schema if not exists `project_rating_system`;
 use `project_rating_system`;
 
 create table if not exists `users`(
 
 `id` int auto_increment not null,
 `login` varchar(50) not null unique,
 `password` varchar(50) not null,
 `status` int not null,
 `fullName` varchar(100) not null,
 `organization` varchar(100) not null,
  constraint `PK_users` primary key (`id` ASC) 
 );
 
create table if not exists `admins`(
 
 `id` int auto_increment not null,
 `login` varchar(50) not null unique,
 `password` varchar(50) not null,
 `email` varchar(50) not null,
  constraint `PK_admins` primary key (`id` ASC) 
 );
 
  create table if not exists `project_types`(
 
 `id` int auto_increment not null,
 `name` varchar(70) not null,
  constraint `PK_project_types` primary key (`id` ASC) 
 );
 
 create table if not exists `project_requests`(
 
 `id` int auto_increment not null,
 `projectTypeId` int not null,
 `complexity` float not null,
  `cost` float not null,
  `dateOfIssue` date not null,
  `userId` int not null,
  constraint `PK_project_requests` primary key (`id` ASC),
  constraint `FK_project_requests_project_types` foreign key(`projectTypeId`) references `project_types` (`id`),
  constraint `FK_project_requests_users` foreign key(`userId`) references `users` (`id`)
 );
 
create table if not exists `finansed_projects`(
 
 `projectId` int unique not null,
 `dateOfFinansing` date not null,
  constraint `FK_finansed_projects_projects` foreign key(`projectId`) references `project_requests` (`id`)
 );
 
 insert into `admins` (login, password, email) values ('admin', 'admin', 'genyalepel9@yandex.ru');
 