Feature: Gradle-Cucumber integration

  Scenario: Bomberman se mueve a la celda izquierda que esta vacia
    Given     un tablero de 9 x 9
    Given     bomberman en una coordenado valida
    When      se mueve a la izquierda
    Then      bomberman cambio su coordenada

  Scenario: Bomberman se mueve a la celda derecha y hay un enemigo
    Given     un tablero de 9 x 9
    Given     bomberman en una celda valida
    Given     un enemigo en una celda valida
    When      se mueve a la derecha
    Then      bomberman muere

  Scenario: Bomberman se intenta mover al norte y hay una pared
    Given     un tablero de 9 x 9
    Given     bomberman en una celda valida
    Given     una pared al norte de la posicion de bomberman
    When      bomberman se mueve al norte
    Then      bomberman permanece en su misma posicion

  Scenario: Bomberman suelta una bomba y hay pared de melamina a 3 casilleros
    Given     un bomberman que suelta una bomba en la posicion actual
    Given     a 3 casilleros del bomberman hay una pared de melamina
    When      luego de unos ticks
    Then      la bomba explota y rompe la pared

  Scenario: Bomberman suelta una bomba y hay un enemigo cerca
    Given     un bomberman que suelta una bomba en la posicion actual
    Given     un enemigo esta cerca de bomberman
    When      luego de unos ticks
    Then      la bomba explota y mata al enemigo

  Scenario: Bomberman suelta una bomba y hay una pared de acero
    Given     un bomberman que suelta una bomba en la posicion actual
    Given     cerca del bomberman hay una pared de acero
    When      luego de unos ticks
    Then      la bomba explota y no rompe la pared

  Scenario: Bomberman suelta una bomba y esta alcanza a bagulaa
    Given     un bomberman que suelta una bomba en la posicion actual
    Given     la bomba alcanza a bagulaa que esta cerca
    When      bagulaa muere
    Then      bagulaa suelta un poder

  Scenario: Bomberman recoge el poder tirado por bagulaa
    Given     un bomberman que va a recoger el poder tirado por bagulaa
    When      agarra el poder
    Then      bomberman puede lanzar la bomba recorriendo "n" casilleros y la detona luego de "m" ticks

  Scenario: Bomberman suelta una bomba y esta alcanza a Proto max jr
    Given     un bomberman que suelta una bomba en la posicion actual
    Given     la bomba alcanza a Proto max jr
    When      Proto max jr muere
    Then      Proto max jr suelta un poder

  Scenario: Bomberman recoge el poder tirado por Proto max jr
    Given     un bomberman que va a recoger el poder tirado por Proto max jr
    When      agarra el poder
    Then      bomberman puede saltar cualquer pared

  Scenario: Bomberman suelta una bomba y esta alcanza a Proto max units
    Given 	  un bomberman que suelta una bomba en la posicion actual
    Given     la bomba alcanza a Proto max units
    When	  Proto max units muere
    Then 	  suelta un poder

  Scenario: Bomberman recoge el poder tirado por Proto max units
    Given 	  un bomberman que va a recoger el poder tirado por Proto max units
    When	  agarra el poder
    Then 	  bomberman puede lanzar varias bombas

  Scenario: Bomberman recoge el poder tirado por Proto max units
    Given 	  un bomberman que va recoger el poder tirado por Proto max units
    When	  agarra el poder
    Then 	  bomberman puede saltar paredes