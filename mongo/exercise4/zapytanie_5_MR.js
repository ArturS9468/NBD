var mapFunction = function() {

    for (var idx = 0; idx < this.credit.length; idx++) {
       var key = this.credit[idx].currency;
       var value = { count: 1, balance: parseFloat(this.credit[idx].balance) };
       emit(key, value);
    }
};

var reduceFunction = function(currency, objects) {
   reducedVal = { count: 0, balance: 0 };

   for (var idx = 0; idx < objects.length; idx++) {
       reducedVal.count += objects[idx].count;
       reducedVal.balance += objects[idx].balance;
   }
   return reducedVal;
};


var finalizeFunction = function (sexes, reducedObject) {
  reducedObject.avgBalance = reducedObject.balance/reducedObject.count;
  return reducedObject;
};

db.people.mapReduce(
   mapFunction,
   reduceFunction,
   {
    out: "money_in_polish_women_account",
    query: { sex: "Female", nationality: "Poland" },
    finalize: finalizeFunction,
   }
)

db.money_in_polish_women_account.find()