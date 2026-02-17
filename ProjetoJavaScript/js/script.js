var nome = document.querySelector("#txNome")

var sobrenome = document.querySelector("#txSobrenome")

var email = document.querySelector("#txEmail")

var date = document.querySelector("#txDataNasc")

var telefone = document.querySelector("#txTelefone")

var assunto = document.querySelector("#txAssunto")

var mensagem = document.querySelector("#txMensagem")

var btDados = document.querySelector("button")

var resultado = document.querySelector("#resultado")

btDados.addEventListener('click',exibirDados)

function exibirDados(){
    resultado.innerHTML = `
        <h1>Dados</h1>
        <p>Nome: ${nome.value}</p>
        <p>Sobrenome: ${sobrenome.value}</p>
        <p>E-mail: ${email.value} </p>
        <p>Data de Nascimento: ${date.value} </p>
        <p>Telefone: ${telefone.value} </p>
        <p>Assunto: ${assunto.value} </p>
        <p>Mensagem: ${mensagem.value} </p>

    `
}