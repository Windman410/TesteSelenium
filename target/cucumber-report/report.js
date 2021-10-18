$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/FormularioSeguroVeiculo.feature");
formatter.feature({
  "name": "Preencher o formul�rio de seguro de veiculo",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@FT001_FormularioSeguroVeiculo"
    }
  ]
});
formatter.scenario({
  "name": "C001 Preencher o formul�rio completo e Enviar o email com sucesso",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@FT001_FormularioSeguroVeiculo"
    },
    {
      "name": "@C001_PreencherFormularioAutomovelCompleto"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar na aba \"Automobile\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "BaseSteps.euClicarNaAba(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar no campo Make a opcao \"Audi\"",
  "keyword": "E "
});
formatter.match({
  "location": "VehicleDataSteps.euSelecionarNoCampoMakeAOpcao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo Engine Performance \"120\"",
  "keyword": "E "
});
formatter.match({
  "location": "VehicleDataSteps.euDigitarNoCampoEnginePerformance(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo Date of Manufacture \"10/15/1970\"",
  "keyword": "E "
});
formatter.match({
  "location": "VehicleDataSteps.euDigitarNoCampoDateOfManufacture(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar no campo Number of Seats a opcao \"4\"",
  "keyword": "E "
});
formatter.match({
  "location": "VehicleDataSteps.euSelecionarNoCampoNumberOfSeatsAOpcao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar no campo Fuel a opcao \"Gas\"",
  "keyword": "E "
});
formatter.match({
  "location": "VehicleDataSteps.euSelecionarNoCampoFuelAOpcao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo List Price \"25000\"",
  "keyword": "E "
});
formatter.match({
  "location": "VehicleDataSteps.euDigitarNoCampoListPrice(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo License Plate Number \"12345678\"",
  "keyword": "E "
});
formatter.match({
  "location": "VehicleDataSteps.euDigitarNoCampoLicensePlateNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo Annual Mileage \"80000\"",
  "keyword": "E "
});
formatter.match({
  "location": "VehicleDataSteps.euDigitarNoCampoAnnualMileage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar o botao next",
  "keyword": "E "
});
formatter.match({
  "location": "BaseSteps.euApertarOBotaoNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo First Name \"Rodrigo\"",
  "keyword": "E "
});
formatter.match({
  "location": "InsurantDataSteps.euDigitarNoCampoFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo Last Name \"Figueiredo\"",
  "keyword": "E "
});
formatter.match({
  "location": "InsurantDataSteps.euDigitarNoCampoLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo Date of Birth \"02/20/1997\"",
  "keyword": "E "
});
formatter.match({
  "location": "InsurantDataSteps.euDigitarNoCampoDateOfBirth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar o radio \"Male\" no campo Gender",
  "keyword": "E "
});
formatter.match({
  "location": "InsurantDataSteps.euSelecionarORadioNoCampoGender(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo Street Address \"Qd 40 Lt 29\"",
  "keyword": "E "
});
formatter.match({
  "location": "InsurantDataSteps.euDigitarNoCampoStreetAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar no campo Country a opcao \"Angola\"",
  "keyword": "E "
});
formatter.match({
  "location": "InsurantDataSteps.euSelecionarNoCampoCountryAOpcao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo Zip Code \"72887288\"",
  "keyword": "E "
});
formatter.match({
  "location": "InsurantDataSteps.euDigitarNoCampoZipCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo City \"Brasilia\"",
  "keyword": "E "
});
formatter.match({
  "location": "InsurantDataSteps.euDigitarNoCampoCity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar no campo Occupation a opcao \"Employee\"",
  "keyword": "E "
});
formatter.match({
  "location": "InsurantDataSteps.euSelecionarNoCampoOccupationAOpcao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar os checkbox no campo Hobbies",
  "rows": [
    {
      "cells": [
        "Speeding",
        "Skydiving"
      ]
    }
  ],
  "keyword": "E "
});
formatter.match({
  "location": "InsurantDataSteps.euSelecionarOsCheckboxNoCampoHobbies(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo Website \"www.site.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "InsurantDataSteps.euDigitarNoCampoWebsite(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar o botao next",
  "keyword": "E "
});
formatter.match({
  "location": "BaseSteps.euApertarOBotaoNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo Start Date \"05/11/2022\"",
  "keyword": "E "
});
formatter.match({
  "location": "ProductDataSteps.euDigitarNoCampoStartDate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar no campo Insurance Sum a opcao \"3000000\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "ProductDataSteps.euSelecionarNoCampoInsuranceSumAOpcao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar no campo Merit Rating a opcao \"Bonus 8\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "ProductDataSteps.euSelecionarNoCampoMeritRatingAOpcao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar no campo Damage Insurance a opcao \"Full Coverage\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "ProductDataSteps.euSelecionarNoCampoDamageInsuranceAOpcao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar os checkbox no campo Optional Products",
  "rows": [
    {
      "cells": [
        "Euro Protection",
        "Legal Defense Insurance"
      ]
    }
  ],
  "keyword": "E "
});
formatter.match({
  "location": "ProductDataSteps.euSelecionarOsCheckboxNoCampoOptionalProducts(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar no campo Courtesy Car a opcao \"Yes\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "ProductDataSteps.euSelecionarNoCampoCourtesyCarAOpcao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar o botao next",
  "keyword": "E "
});
formatter.match({
  "location": "BaseSteps.euApertarOBotaoNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu selecionar o radio \"Gold\" no campo Price Option",
  "keyword": "E "
});
formatter.match({
  "location": "PriceOptionQuoteSteps.euSelecionarORadioNoCampoPriceOption(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar o botao next",
  "keyword": "E "
});
formatter.match({
  "location": "BaseSteps.euApertarOBotaoNext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo Email \"email@gmail.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "PriceOptionQuoteSteps.euDigitarNoCampoEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo Phone \"912345678\"",
  "keyword": "E "
});
formatter.match({
  "location": "PriceOptionQuoteSteps.euDigitarNoCampoPhone(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo Username \"usuario\"",
  "keyword": "E "
});
formatter.match({
  "location": "PriceOptionQuoteSteps.euDigitarNoCampoUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo Password \"Senha123\"",
  "keyword": "E "
});
formatter.match({
  "location": "PriceOptionQuoteSteps.euDigitarNoCampoPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo Confirm Password \"Senha123\"",
  "keyword": "E "
});
formatter.match({
  "location": "PriceOptionQuoteSteps.euDigitarNoCampoConfirmPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo Comments \"Comentario digitado apenas para preencher o campo\"",
  "keyword": "E "
});
formatter.match({
  "location": "PriceOptionQuoteSteps.euDigitarNoCampoComments(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "eu apertar o botao send",
  "keyword": "E "
});
formatter.match({
  "location": "PriceOptionQuoteSteps.euApertarOBotaoSend()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aparece a mensagem \"Sending e-mail success!\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "BaseSteps.apareceAMensagem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});