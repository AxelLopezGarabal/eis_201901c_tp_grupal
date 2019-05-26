Feature: Bomberman Feature

#casos de movimiento

  Scenario: bomberman se mueve a la celda izquierda que esta vacia
    Given un tablero de 9 x 9
    And bomberman en una coordenada valida
    When se mueve a la izquierda
    Then bomberman cambio su coordenada
							  
  Scenario: bomberman se mueve a la derecha y hay un enemigo
    Given un tablero de 9 x 9
    And bomberman en una coordenada valida
    And un enemigo en una coordenada valida
    When bomberman se mueve a la derecha
    Then bomberman muere

  Scenario: bomberman se intenta mover al norte y hay una pared
    Given un tablero de 9 x 9
    And bomberman en una coordenada valida
    And una pared al norte de la posicion de bomberman
    When bomberman se mueve al norte
    Then  bomberman no cambia su coordenada

#casos de bombas

  Scenario: bomberman suelta una bomba y hay pared de melamina a 3 casilleros
    Given un tablero de 9 x 9
    And bomberman en una coordenada valida
    And un bomberman que suelta una bomba en la posicion actual
    When luego de unos ticks la bomba explota
    Then rompe la pared

  Scenario: bomberman suelta una bomba y hay un enemigo cerca
    Given un tablero de 9 x 9
    And bomberman en una coordenada valida
    And un bomberman que suelta una bomba en la posicion actual
    And un enemigo al norte de la posicion del bomberman
    When luego de unos ticks la bomba explota
    Then la bomba mato al enemigo

  Scenario: bomberman suelta una bomba y hay pared de acero
    Given un tablero de 9 x 9
    And bomberman en una coordenada valida
    And una pared de acero al este de la posicion de bomberman
    And un bomberman que suelta una bomba en la posicion actual
    When luego de unos ticks la bomba explota
    Then la pared de acero no se rompio

#  Scenario: bombeman suelta una bomba y esta alcanza a bagulaa
#    Given: un bomberman que suelta una bomba en la posicion actual
#    Given:  la bomba alcanza a bagulaa
#    When: bagulaa muere
#    Then: bagulaa suelta un poder
#
#  Scenario: bomberman recoge el poder tirado por bagula
#    Given: un bomberman que va a recoger el poder tirado por bagulaa
#    When: agarra el poder
#    Then: bomberman puede lanzar la bomba recorriendo "n" casilleros y la detona luego de "m" ticks
#
#    
#    
#  Scenario: bomberman suelta una bomba y esta alcanza a Proto max jr
#    Given: un bomberman que suelta una bomba en la posicion actual
#    Given: la bomba alcanza a Proto max jr
#    When: Proto max jr muere
#    Then: suelta un poder
#
#  Scenario: bomberman recoge el poder tirado por Proto max jr
#    Given: un bomberman que va a recoger el poder tirado por Proto max jr
#    When: agarra el poder
#    Then: bomberman puede saltar cualquier pared
#
#    
#    
#  Scenario: bomberman suelta una bomba y esta alcanza a Proto max units
#    Given: un bomberman que suelta una bomba en la posicion actual
#    Given: la bomba alcanza a Proto max units
#    When: Proto max units muere
#    Then: suelta un poder
#
#  Scenario: bomberman recoge el poder tirado por Proto max units
#    Given: un bomberman que va a recoger el poder tirado por Proto max units
#    When: agarra el poder
#    Then: bomberman puede lanzar varias bombas
#
#  Scenario: bomberman recoge el poder tirado por Proto max units
#    Given: un bomberman que va recoger el poder tirado por Proto max units
#    When: agarra el poder
#    Then: bomberman puede saltar paredes