var mapFunction2 = function() {
    for (var idx = 0; idx < this.credit.length; idx++) {
       var key = this.credit[idx].currency;
       var value = parseFloat(this.credit[idx].balance);
       emit(key, value);
    }
};


var reduceFunction2 = function(currencies, balances) {
    return Array.sum(balances);
};

db.people.mapReduce(
   mapFunction2,
   reduceFunction2,
   { out: "money_in_account" }
)

db.money_in_account.find()
