Feature: Bomberman Feature

# default
  Background:
    Given un tablero de 9 x 9
    And bomberman en una coordenada valida
  
#casos de movimiento

  Scenario: bomberman se mueve a la celda izquierda que esta vacia
    When se mueve a la izquierda
    Then bomberman cambio su coordenada
							  
  Scenario: bomberman se mueve a la derecha y hay un enemigo
    Given un enemigo en una coordenada valida
    When bomberman se mueve a la derecha
    Then bomberman muere

  Scenario: bomberman se intenta mover al norte y hay una pared
    Given una pared al norte de la posicion de bomberman
    When bomberman se mueve al norte
    Then  bomberman no cambia su coordenada


#casos de bombas

  Scenario: bomberman suelta una bomba y hay pared de melamina a 3 casilleros
    Given un bomberman que suelta una bomba en la posicion actual
    When luego de unos ticks la bomba explota
    Then rompe la pared

  Scenario: bomberman suelta una bomba y hay un enemigo cerca
    Given un bomberman que suelta una bomba en la posicion actual
    And un enemigo al norte de la posicion del bomberman
    When luego de unos ticks la bomba explota
    And bomberman se mueve al norte
    Then la bomba mato al enemigo

  Scenario: bomberman suelta una bomba y hay pared de acero
    Given una pared de acero al este de la posicion de bomberman
    And un bomberman que suelta una bomba en la posicion actual
    When luego de unos ticks la bomba explota
    Then la pared de acero no se rompio


#casos de enemigos y poderes

  #Bagulaa
  Scenario: bomberman suelta una bomba y esta alcanza a bagulaa
    Given un bomberman que suelta una bomba en la posicion actual
    And bagulaa al norte de la posicion del bomberman
    When luego de unos ticks la bomba explota
    And bomberman se mueve al norte
    Then la bomba mato al enemigo
    And bagulaa suelta un poder
    
  Scenario: bomberman suelta una bomba y esta alcanza a bagulaa, luego lanza la bomba con el poder obtenido
    Given un bomberman con poder lanza bombas
    And bagulaa a 7 casilleros al este
    Then bomberman lanza la bomba recorriendo 5 casilleros y la detona luego de 3 ticks
    And bomberman se mueve 7 casilleros al este
    And la bomba mato al enemigo

  #Proto Max Jr
  Scenario: bomberman suelta una bomba y esta alcanza a Proto max jr
    Given un bomberman que suelta una bomba en la posicion actual
    And proto max jr al sur de la posicion del bomberman
    When luego de unos ticks la bomba explota
    And bomberman se mueve al sur
    Then la bomba mato al enemigo
    And proto max jr suelta un poder

# TODO: esto deberia estar en el test de arriba
#  Scenario: bomberman recoge el poder tirado por Proto max jr
#    Given un bomberman que va a recoger el poder tirado por Proto max jr
#    When agarra el poder
#    Then bomberman puede saltar cualquier pared

  Scenario: bomberman suelta una bomba y esta alcanza a Proto max units
    Given un bomberman que suelta una bomba en la posicion actual
    And proto max units al sur de la posicion del bomberman
    When luego de unos ticks la bomba explota
    And bomberman se mueve al sur
    Then la bomba mato al enemigo
    And proto max units suelta un poder

# TODO: esto deberia estar en el test de arriba
#  Scenario: bomberman recoge el poder tirado por Proto max units
#    Given un bomberman que va a recoger el poder tirado por Proto max units
#    When agarra el poder
#    Then bomberman puede lanzar varias bombas
#    Then bomberman puede saltar paredes