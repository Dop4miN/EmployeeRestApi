EmployeeRestApi
===============

The EmployeeRestApi repository is a demo project. It creates a RESTful webservice on http://localhost:8080.

Users are able to create, read, update and delete employees from the API.

To do so, you need to use a HTTP-Client like [postman](https://www.postman.com/) or curl in your CLI on this URL:
http://localhost:8080/employees. The data is stored in your RAM.

An employee has the following properties:
- id (auto-incremented)
- firstName
- surName
- emailAddress

## Usage:

**Create:**
```
curl -X POST localhost:8080/employees -H 'Content-type:application/json' -d '{"firstName": "John", "surName": "Doe", "emailAddress": "john@doe.com"}'
```

**Read:**

If you're looking for a specific employee, just append the id to the URL like this.
```
curl -v localhost:8080/employees/1
```

**Update:**

To update a specific employee, call it like in the URL above and do the following:
```
curl -X PUT localhost:8080/employees/1 -H 'Content-type:application/json' -d '{"firstName": "Johnny", "surName": "Doe", "emailAddress": "johnny@doe.com"}'
```

**Delete:**

This deletes the first employee:
```
curl -X DELETE localhost:8080/employees/1
```