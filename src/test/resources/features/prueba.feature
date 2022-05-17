#Autor Carlos Julio Buitrago
#language: es

  @HistoriaDeUsuario
  Característica: verificar el ingreso correcto a la app XTTT

    Yo como usuario quiero ingresar a la pagina XTTT para verificar que tengo acceso a ella

    @CasoLogueo
    Escenario: Verificar ingreso correcto
      Dado que Carlos ingresa a la app XTTT
      Cuando digita sus credenciales e ingresa a la app
      Entonces verifica que pudo ingresar correctamente
