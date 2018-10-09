# back-card : back-end service for manage advisors

## build
mvn clean package

## Launch
java -jar target/back-advisor-0.0.1-SNAPSHOT.jar

## Docker
sudo ./build.sh version

## Datas
```
{ 
    "_id" : ObjectId("5bbcfd96880fa941e4dd6ad5"), 
    "firstName" : "Pierre", 
    "lastName" : "Bonvou", 
    "specialties" : [

    ]
}
{ 
    "_id" : ObjectId("5bbcfd9e880fa941e4dd6ad6"), 
    "firstName" : "Guillaume", 
    "lastName" : "Gentil", 
    "specialties" : [

    ]
}
{ 
    "_id" : ObjectId("5bbcfda3880fa941e4dd6ad7"), 
    "firstName" : "Juliette", 
    "lastName" : "Hofleur", 
    "specialties" : [
        "saving"
    ]
}
{ 
    "_id" : ObjectId("5bbcfda8880fa941e4dd6ad8"), 
    "firstName" : "Helene", 
    "lastName" : "Lapic", 
    "specialties" : [
        "saving"
    ]
}
{ 
    "_id" : ObjectId("5bbcfdad880fa941e4dd6ad9"), 
    "firstName" : "Raphaelle", 
    "lastName" : "Lefrancois", 
    "specialties" : [
        "credits", 
        "insurance"
    ]
}
{ 
    "_id" : ObjectId("5bbcfdb1880fa941e4dd6ada"), 
    "firstName" : "Marie", 
    "lastName" : "Ortega", 
    "specialties" : [
        "credits"
    ]
}

```