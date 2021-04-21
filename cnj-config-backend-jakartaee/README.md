# cnj-config-backend-jakartaee

Simplest possible cloud native java application based on Jakarta EE 9.

## Docker Pull Command
`docker pull docker.cloudtrain.aws.msgoat.eu/cloudtrain/cnj-config-backend-jakartaee`

## Run this application 

``` 
docker run --name cnj-config-backend-jakartaee -p 8080:8080 docker.cloudtrain.aws.msgoat.eu/cloudtrain/cnj-config-backend-jakartaee
```

## Build this application 

See [cnj-config](../README.md) for build instructions.

``` 
mvn clean verify -P pre-commit-stage
```

Build results: a Docker image containing a Payara Full Profile application server plus the deployed application.

## Exposed REST endpoints

### /api/v1/hello

Returns a simple welcome message to the currently authenticated user.

Method
: GET

URI
: /api/v1/hello

Parameter(s)
: none

Response
: welcome message as JSON document

Authentication type
: none

Role(s) required
: none


## Exposed environment variables

## Exposed Ports

| Port | Protocol | Description |
| --- | --- | --- |
| 8080 | HTTP | HTTP endpoint of this spring boot application | 
 
## Version / Tags

| Tag(s) | Remarks |
| --- | --- |
| latest, 1.0.0 | first release |
