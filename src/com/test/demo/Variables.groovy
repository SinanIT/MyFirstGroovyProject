package com.test.demo

def name = "Sinan"

println 'Name is ' + name

println 'Name is ${name}' //Name is ${name}
println "Name is ${name}" //Name is Sinan

//we can use digits, letters, underscore. Groovy is case sensitive like java

def _name1= "Can"

def x = 10
def X = 20
println x
println X

//groovy is dinamic typing language

name = 11// it was "Sinan"
println name


def (a, b, c) = [30,50,70]
println a
println b
println c

//multiple assignments
def (String g, int d, double e) = ['Can', 50, 70.90]
println a
println b
println g


