
POST http://localhost:8080/api/clients

{
	"lastName": "Alice",
	"firstName": "Bob",
	"phone": "555 123-4587"
}


{
	"lastName": "Bob",
	"firstName": "Bob",
	"phone": "321 123-4587"
}


{
	"lastName": "Anny",
	"firstName": "Bob",
	"phone": "888 123-6756"
}

REST-запит на отримання даних за id

GET http://localhost:8080/api/clients/2


REST-запит на оновлення даних за id.

PUT http://localhost:8080/api/clients

{
	"id": 2,
	"lastName": "Bob",
	"firstName": "Bob",
	"phone": "321 123-4587"
}


5) REST-запит на видалення даних за id

DELETE http://localhost:8080/api/clients/3

