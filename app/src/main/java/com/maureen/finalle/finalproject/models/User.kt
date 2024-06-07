package com.maureen.finalle.finalproject.models

class User {
    var name: String=""
    var email: String=""
    var pass: String=""
//    var confirmpass: String=""

    constructor(name: String, email:String,pass:String){
        this.name = name
        this.email= email
        this.pass=pass
    }
    constructor()
}