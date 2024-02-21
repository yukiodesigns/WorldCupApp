package com.example.worldcup

class CountryModel {

    var name: String = ""
    var cupWins: String = ""
    var  flag: Int = 0

    constructor(name: String, cupWins: String, flag: Int) {
        this.name = name
        this.cupWins = cupWins
        this.flag = flag
    }
}