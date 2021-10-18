#Author: Rodrigo Fernandes Figueiredo
#language: pt
#enconding: UTF-8

@FT001_FormularioSeguroVeiculo
Funcionalidade: Preencher o formulário de seguro de veiculo



@C001_PreencherFormularioAutomovelCompleto
Cenario: C001 Preencher o formulário completo e Enviar o email com sucesso
	Quando eu clicar na aba "Automobile"
	E eu selecionar no campo Make a opcao "Audi"
	E eu digitar no campo Engine Performance "120"
	E eu digitar no campo Date of Manufacture "10/15/1970"
	E eu selecionar no campo Number of Seats a opcao "4"
	E eu selecionar no campo Fuel a opcao "Gas"
  E eu digitar no campo List Price "25000"
	E eu digitar no campo License Plate Number "12345678"
	E eu digitar no campo Annual Mileage "80000"
	E eu apertar o botao next
	E eu digitar no campo First Name "Rodrigo"
	E eu digitar no campo Last Name "Figueiredo"
	E eu digitar no campo Date of Birth "02/20/1997"
	E eu selecionar o radio "Male" no campo Gender 
	E eu digitar no campo Street Address "Qd 40 Lt 29"
	E eu selecionar no campo Country a opcao "Angola"
	E eu digitar no campo Zip Code "72887288"
	E eu digitar no campo City "Brasilia"
	E eu selecionar no campo Occupation a opcao "Employee"
	E eu selecionar os checkbox no campo Hobbies 
	|Speeding|Skydiving|
	E eu digitar no campo Website "www.site.com"
	E eu apertar o botao next
	E eu digitar no campo Start Date "05/11/2022"
	Quando eu selecionar no campo Insurance Sum a opcao "3000000"
	Quando eu selecionar no campo Merit Rating a opcao "Bonus 8"
	Quando eu selecionar no campo Damage Insurance a opcao "Full Coverage"
	E eu selecionar os checkbox no campo Optional Products				
	|Euro Protection|Legal Defense Insurance|
	Quando eu selecionar no campo Courtesy Car a opcao "Yes"
	E eu apertar o botao next
	E eu selecionar o radio "Gold" no campo Price Option 
	E eu apertar o botao next
	E eu digitar no campo Email "email@gmail.com"
	E eu digitar no campo Phone "912345678"
	E eu digitar no campo Username "usuario"
	E eu digitar no campo Password "Senha123"
	E eu digitar no campo Confirm Password "Senha123"
	E eu digitar no campo Comments "Comentario digitado apenas para preencher o campo"
	E eu apertar o botao send
	Entao aparece a mensagem "Sending e-mail success!"
	