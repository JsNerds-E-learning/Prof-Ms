# Microservice prof
- [Microservice prof](#microservice-prof)
  - [Introduction](#introduction)
  - [Technologies used](#technologies-used)
    - [Eureka Server](#eureka-server)
    - [Eureka Client](#eureka-client)
    - [mysql database](#mysqldb:5.7)
    - [Eureka Zuul gateway](#eureka-zuul-gateway)
    - [***Api requests***](#api-requests)
      - [**prof Model**](#prof-model)
      - [**List prof**](#list-prof)
      - [**Create prof**](#create-prof)
      - [**Update prof**](#update-prof)
      - [**Delete prof**](#delete-prof)


## Introduction
this is the prof micro service of this app,it registers prof informations. I made this micro service for our class project while learning micro services and how to configure a eureka server and the micro services that will register into it.


## Technologies used
### Eureka Server
The Eureka server is in this [repository](https://github.com/JsNerds-E-learning/EurekaServer) we used a spring boot project with spring cloud and [Netflix eureka](https://github.com/Netflix/eureka) as dependencies
### Eureka Client
This micro service is a Spring app that registers in the eureka server with the [spring-cloud-starter-netflix-eureka-client](https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-client) dependecy 
### Eureka Zuul gateway
The gateway is in the [Zuul-Gateway repository](https://github.com/JsNerds-E-learning/Zuul-Gateway)
like the server we created the gateway with spring boot and netflix zuul as dependencies


### ***Api requests***
#### **prof Model**
    prof : {
    "adresse_user":"address"	,
    "date_naissance":"2021-10-21",
    "firstName":"aziz",
    "lastName":"aziz",
    "mail_user":"aziz@aziz.com"	,
    "salaire_user":"55",
    "sexe_user":"m",
    "grade":"2eme dame"
    "tel_user":"2556586"}



#### **List prof**
<hr>
to list all the prof you need to:
<ul>
    <li>use the <strong>GET</strong>  method</li>
    <li>use this path: /retrieve-all-users</li>
    
</ul>

#### **Create prof**
<hr>  
to create a new course you need to:
<ul>
    <li>use the <strong>POST</strong>  method</li>
    <li>use this path: /add-prof</li> 
    <li>add a json in the request body with the added prof</li>
</ul>

#### **Update prof**
<hr>
to update a prof yout need to:
<ul>
    <li>use the <strong>PUT</strong> method</li>
    <li>use this path:/update-prof/:id (":id" = the Id of the old prof)</li>
    <li>add a json in the request body with the new prof</li>
</ul>

#### **Delete prof**
<hr>
to delete a prof you need to: 
<ul>
    <li>use the <strong>DELETE</strong>  method</li>
    <li>use this path: /delete-prof/:id (":id" = the Id of the prof to delete)</li>
    
</ul>
