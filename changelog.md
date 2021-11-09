# Changelog
All notable changes to `cnj-config` will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [6.0.0] - 2021-11-09
### Added
### Changed
- released version 6.0.0 of all showcases
- upgraded to the latest versions of runtime environments and servers
- upgraded to the latest versions of maven plugins
- switched from javaee dependencies to jakartaee dependencies (except for quarkus)
- replaced custom health endpoints with standard health endpoints (microprofile, quarkus)
- removed javaee/jakartaee showcase since it does not differ significantly from the microprofile showcase

## [5.0.0] - 2021-04-21
### Added
### Changed
- moved to new AWS CloudTrain environment without any behavioural changes
- all runtimes updated to latest versions
- renamed javaee showcase jakartaee
- switched from javaee 8 to jarkataee 9 in jakartaee showcase

## [4.0.0] - 2020-10-05
### Added
- added Quarkus showcase
### Changed
- upgraded all showcases to Java 11 and latest versions of Payara (5.194) or Spring Boot (2.2.4.RELEASE)
- upgraded all Maven plugins and dependencies
- consolidated Maven POMs
- consolidated Helm chart filtering

## [3.0.0] - 2020-02-21
### Added
### Changed
- upgraded all showcases to Java 11 and latest versions of Payara (5.194) or Spring Boot (2.2.4.RELEASE)
- upgraded all Maven plugins and dependencies
- consolidated Maven POMs
- consolidated Helm chart filtering
