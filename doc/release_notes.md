Release 0.3.5 (2020-08-06) Latest
=================================
Utilities
----
* Add debug step

Release 0.3.4 (2020-03-04) 
=================================
Database Operations
----
* Support multiple/additional datasources


Release 0.3.3 (2019-11-20)
=================================
Verification
----
* fix defect when response body returns simple array


Release 0.3.2 (2019-11-05)
=================================
HTTP
----
* form(multipart/form-data) supported

Verification
---------
* nested variable reference in verification key

Release 0.3.1 (2019-05-11)
=================================

HTTP
----

* http request header support variables

Release 0.3.0 (2019-05-11)
=================================
Graphql Test
------------

* Support graphql query and mutation

Release 0.2.8 (2019-01-29)
=================================
Variables
---------
* Define variable by extract reponse body as plain text

Release 0.2.7 (2019-01-28)
=================================
Variables
-----------
* Define variable by extract cookies from response

Release 0.2.6 (2019-01-28)
=================================
Issue Fixed
-----------
* Fix json schema verification type checking not working

Release 0.2.5 (2018-12-29)
=================================

Variables
---------
* Remove single quote around variable name for variable definition

Verifications
-------------
* JSON verification has size


Release 0.2.4 (2018-11-10) 
=================================
Issue fixed
-----------
* Fix intellij run configuration complains transactiondefinition classnodeferror

Other
-----
* Add banner


Relase 0.2.3  (2018-11-4)
================================
Variables
---------
* Passing along response to next reqeust

Relase 0.2.2  (2018-11-2)
================================
Feature Configuration
---------------------
* Faker locale

Variables
---------
* Use Faker to generate fake data

Relase 0.2.1 (2018-10-24)
================================
Variables
---------
* Initialize from properties file
* Definition by evaluate javascript code
* Usage in javascript code evaluation

Verfications
------------
* Verify javascript code

Others
-----------
* Suppress http compliance validation


Release 0.2.0 (2018-10-21)
=================================
Mongo DB
--------
* Insert
* Clear
* Find all
* Find

Issue fixed
----
* Execute sql not repeatable
* Variable cannot verify josn schema


Release 0.1.2 (2018-10-15)
=================================
HTTP(S)
-------
* Global request headers

Wait
----
* wait and retry multiple actions

Verification
------------
* verify json schema

Release 0.1.1 (2018-10-8)
================================
HTTP(S)
-------
* Custom content-type
* Cookie
* Ignore SSL host verification
* SSL configuration
* Upload file

Verification
------------
* Verify null
* Verify variable
* Verify JSON
    * same json
    * contains json

Utitlies
--------
* Random UUID


Release 0.1.0 (2018-10-5)
========

HTTP
----
* Methods
    * GET
    * POST
    * PUT
    * DELETE
    * PATCH
    * HEAD
    * OPTIONS
    * TRACE
* request header
* request body
* response header
* response status
* response body

Database Operations
-------------------
* Queries
* Execute SQL

Variables
---------
* Defintion
    * Literal string
    * String
    * Integer
    * Extract from response body
* Use Variables
    * In URI
    * In File
    * In Text

Verfiation
----------
* Verify http response
    * response status
    * response header
    * response body
* Verify database tables
    * String
    * BigDecimal
    * Boolean
    * Integer
    * Long
    * Float
    * Double
    * Datetime
* Verify String
    * Equals
    * Contains
    * Starts With
    * Ends With
    * Length
    * Regex Match
* Verify numbers
    * Greater than
    * Less than
    * Other types
* Verify datetime
    * Equals
    * Before
    * After
* Write your own


Wait
----
* Simple Wait
* Wait Until
