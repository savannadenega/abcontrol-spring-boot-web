var ButtonForms = (function () {

    var obras = ["obra1", "obra2", "obra3", "obra4", "obra5"];
    obrasOrdem = 0;

    var tarefas = ["tarefa1", "tarefa2", "tarefa3", "tarefa4", "tarefa5"];
    tarefasOrdem = 0;

    var equipes = ["equipe1", "equipe2", "equipe3", "equipe4", "equipe5"];
    equipesOrdem = 0;

    var anexos = ["anexo1", "anexo2", "anexo3", "anexo4", "anexo5"];
    anexosOrdem = 0;

    var orcamentosGerais = ["orcamentoGeral1", "orcamentoGeral2", "orcamentoGeral3", "orcamentoGeral4", "orcamentoGeral5"];
    orcamentosGeraisOrdem = 0;
    
    var orcamentosSimulacoesGerais = ["orcamentoSimulacaoGeral1", "orcamentoSimulacaoGeral2", "orcamentoSimulacaoGeral3", "orcamentoSimulacaoGeral4", "orcamentoSimulacaoGeral5"];
    orcamentosSimulacoesGeraisOrdem = 0;

    return {

        showNextObraButton: function () {

            if(obrasOrdem < 5){
                let buttonAtual = document.getElementById(obras[obrasOrdem]);

                buttonAtual.style.display = "block"; // block para aparecer, none para desaparecer
            } 
            
            obrasOrdem++;
        },

        showNextTarefaButton: function () {

            if(tarefasOrdem < 5){
                let buttonAtual = document.getElementById(tarefas[tarefasOrdem]);

                buttonAtual.style.display = "block"; // block para aparecer, none para desaparecer
            }
            tarefasOrdem++;
        },

        showNextEquipeButton: function () {

            if(equipesOrdem < 5){
                let buttonAtual = document.getElementById(equipes[equipesOrdem]);

                buttonAtual.style.display = "block"; // block para aparecer, none para desaparecer
            }
            equipesOrdem++;
        },

        showNextAnexoButton: function () {

            if(anexosOrdem < 5){
                let buttonAtual = document.getElementById(anexos[anexosOrdem]);

                buttonAtual.style.display = "block"; // block para aparecer, none para desaparecer
            }
            anexosOrdem++;
        },

        showNextOrcamentoGeralButton: function () {

            if(orcamentosGeraisOrdem < 5){
                let buttonAtual = document.getElementById(orcamentosGerais[orcamentosGeraisOrdem]);

                buttonAtual.style.display = "block"; // block para aparecer, none para desaparecer
            }
            orcamentosGeraisOrdem++;
        },

        showNextorcamentoSimulacaoGeralButton: function () {

            if(orcamentosSimulacoesGeraisOrdem < 5){
                let buttonAtual = document.getElementById(orcamentosSimulacoesGerais[orcamentosSimulacoesGeraisOrdem]);

                buttonAtual.style.display = "block"; // block para aparecer, none para desaparecer
            }
            orcamentosSimulacoesGeraisOrdem++;
        }

    }


    /*
    var obras = documento.getElementByClass("obra")

obra[0]
VM364:1 Uncaught ReferenceError: obra is not defined
    at <anonymous>:1:1
(anonymous) @ VM364:1
obras[0]
<input type=​"text" value name=​"obra1" class=​"obra">​
obras[0].style.display="none"
"none"
obras[0].style.display="block"
"block"
obras[0].style.display="none"
"none"

adiciona um botão que execute estas ações
*/

})();