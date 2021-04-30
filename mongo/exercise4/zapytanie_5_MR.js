var mapFunction = function() {
    for (var idx = 0; idx < this.credit.length; idx++) {
       var key = this.credit[idx].currency;
       var value = parseFloat(this.credit[idx].balance);
       emit(key, value);
    }
};


var reduceFunction = function(currencies, balances) {
    return {avg : Array.avg(balances), sum : Array.sum(balances)};
};

db.people.mapReduce(
   mapFunction,
   reduceFunction,
   {
    out: "money_in_polish_women_account",
    query: { sex: "Female", nationality: "Poland" },
   }
)

db.money_in_polish_women_account.find()
