printjson(db.people.find({
  "$expr": {
    "$and": [
      {
        "$gte": [
          { "$dateFromString": { "dateString": "$birth_date" }}, ISODate("2001-01-01T00:00:00Z")
        ]
      },
      {
        "$lt": [
          { "$dateFromString": { "dateString": "$birth_date" }}, ISODate("2101-01-01T00:00:00Z")
        ]
      }
    ]
  }
}, { first_name: 1, last_name: 1, "location.city": 1, _id: 0} ).toArray())