package br.ufscar.dc.dsw

class Conta {

    static constraints = {
        numero(blank: false)
        saldo(nullable: false, min: 0.0d)
        abertura(nullable: false)
    }

    String numero
    double saldo
    Date abertura
}