let insert = db.people.insertOne({
    "sex" : "Female",
    "first_name" : "Diana",
    "last_name" : "Sandura",
    "job" : "Programmer",
    "location" : {
            "city" : "Mountain View",
            "address" : {
                    "streetname" : "Alamo Ct.",
                    "streetnumber" : "1"
            }
    },
    "description" : "SKilled programmer",
    "height" : "171.00",
    "birth_date" : "1999-01-09T08:00:00Z",
    "nationality" : "Poland",
    "credit" : [
            {
                    "type" : "jcb",
                    "number" : "12345678",
                    "currency" : "USD",
                    "balance" : "100000000.00"
            }
    ]
});
printjsononeline(insert);