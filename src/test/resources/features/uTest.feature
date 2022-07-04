# language: es
@Historias
Característica: Registro Utest
  Como usuario quiero hacer un registro en la página de uTest
  @Escenario1:
  Esquema del escenario: Realizar el registro
    Dado Que Edwin quiere realizar el registro en la pagina de uTest
    Cuando El busca la pagina de uTest y da clic en el boton unete hoy
      | strNombre   | strApellido   | strEmail   | strMes   | strDia   | strAnio   | strLenguaje   | strCiudad   | strPostal   | strPais   | strPc   | strVersionPc   | strLenguajePC   | strMovil   | strModeloMovil   | strSitemaMovil   | strClave   |
      | <strNombre> | <strApellido> | <strEmail> | <strMes> | <strDia> | <strAnio> | <strLenguaje> | <strCiudad> | <strPostal> | <strPais> | <strPc> | <strVersionPc> | <strLenguajePC> | <strMovil> | <strModeloMovil> | <strSitemaMovil> | <strClave> |
    Entonces El queda registrado en la pagina de Utest
      | strCompletarRegistro  |
      | <strCompletarRegistro> |
    Ejemplos:
      | strNombre | strApellido | strEmail                | strMes    | strDia | strAnio | strLenguaje | strCiudad | strPostal | strPais | strPc    | strVersionPc | strLenguajePC | strMovil | strModeloMovil | strSitemaMovil | strClave       | strCompletarRegistro |
      | Edwin     | Cordoba     | edwinrc8@gmail.com      | September | 29     | 1989    | Spanish     | Lima      | 15001     | Peru    | Ubuntu   | Ubuntu 19.04 | Spanish       | Huawei   | Express        | Android 4.0    | Abc123*abc123  | Complete Setup       |
      | Edwin     | Cordoba     | edwinrc9@gmail.com      | September | 17     | 1992    | English     | Lima      | 15001     | Peru    | Ubuntu   | Ubuntu 19.04 | English       | Huawei   | Ideos X5        | Android 5.0    | Abc123*abc123  | Complete Setup       |