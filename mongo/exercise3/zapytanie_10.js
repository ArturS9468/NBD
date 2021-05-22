db.people.count({"job":"Editor", "email": {$exists: true}})
db.people.updateMany({"job": "Editor"}, {$unset: {"email": ""}})
db.people.count({"job":"Editor", "email": {$exists: true}})

//ok