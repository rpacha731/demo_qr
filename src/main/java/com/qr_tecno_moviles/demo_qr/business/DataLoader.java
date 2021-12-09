package com.qr_tecno_moviles.demo_qr.business;

import com.qr_tecno_moviles.demo_qr.model.ItemExternalLink;
import com.qr_tecno_moviles.demo_qr.model.ItemGallery;
import com.qr_tecno_moviles.demo_qr.model.ItemMuseo;
import com.qr_tecno_moviles.demo_qr.persistence.ItemMuseoRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
@Slf4j
public class DataLoader implements CommandLineRunner {

    private ItemMuseoRepository itemMuseoRepository;

    @Override
    public void run(String... args) {

        if (itemMuseoRepository.findAll().isEmpty()) {

            List<ItemMuseo> items = new ArrayList<>();

//            List<ItemGallery> list = new ArrayList<>();
//
//            list.add(ItemGallery.builder()
//                    .url("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Mona_Lisa_detail_face.jpg/330px-Mona_Lisa_detail_face.jpg")
//                    .description("Cara mona lisa").build());

            List<ItemExternalLink> links = new ArrayList<>();

            links.add(ItemExternalLink.builder()
                    .url("https://es.wikipedia.org/wiki/La_Gioconda")
                    .name("Wiki").build());

            links.add(ItemExternalLink.builder()
                    .url("https://historia-arte.com/obras/la-gioconda")
                    .name("Obra").build());

            items.add(ItemMuseo.builder()
                    .itemTitle("La Giaconda")
                    .roomName("Sala 1")
                    .itemIntro("El Retrato de Lisa Gherardini, esposa de Francesco del Giocondo, más conocido como La Gioconda o " +
                            "La Mona Lisa, es una obra pictórica del polímata renacentista italiano Leonardo da Vinci.")
                    .itemMainContent("Su nombre, La Gioconda (la Alegre, en castellano), deriva de la tesis más aceptada acerca de la " +
                            "identidad de la modelo: la esposa de Francesco Bartolomeo de Giocondo, que realmente se llamaba Lisa Gherardini, " +
                            "de donde viene su otro nombre: Monna (señora, en el italiano antiguo) Lisa. El Museo del Louvre acepta el título " +
                            "completo indicado al principio como el título original de la obra, aunque no reconoce la identidad de la modelo y " +
                            "tan solo la acepta como una hipótesis.\n" +
                            "Es un óleo sobre tabla de álamo de 77 × 53 cm, pintado entre 1503 y 1519, y retocado varias veces por el autor. " +
                            "Se considera el ejemplo más logrado de sfumato, técnica muy característica de Leonardo, si bien actualmente su " +
                            "colorido original es menos perceptible por el oscurecimiento de los barnices. El cuadro está protegido por múltiples " +
                            "sistemas de seguridad y ambientado a temperatura estable para su preservación óptima. Es revisado constantemente " +
                            "para verificar y prevenir su deterioro.")
                    .itemMainPicture("https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Leonardo_da_Vinci_-_Mona_Lisa_%28Louvre%2C_Paris%29.jpg/368px-Leonardo_da_Vinci_-_Mona_Lisa_%28Louvre%2C_Paris%29.jpg")
//                    .itemGallery(list)
                    .itemYoutube("https://www.youtube.com/watch?v=MH3swJ0Tz1g")
                    .itemTags("Arte - Renacimiento")
                    .itemExternalLinks(links)
                    .itemLat("-42.556215")
                    .itemLong("-64.69871")
                    .itemAudioLink("https://commons.wikimedia.org/w/index.php?title=File%3AEs-La_Gioconda-article.ogg")
                    .build());

            links = new ArrayList<>();

            links.add(ItemExternalLink.builder()
                    .url("https://es.wikipedia.org/wiki/Pterodactylus")
                    .name("Wiki").build());

            links.add(ItemExternalLink.builder()
                    .url("https://www.ecured.cu/Pterod%C3%A1ctilo")
                    .name("EcuRed").build());

            items.add(ItemMuseo.builder()
                    .itemTitle("Pterodactylus")
                    .roomName("Sala 2")
                    .itemIntro("Fue el primero en ser nombrado e identificado como un reptil volador. Sus restos fósiles han sido hallados " +
                            "primordialmente en la Caliza de Solnhofen de Baviera, Alemania, que data de finales del período Jurásico " +
                            "(principios del Titoniense), hace entre 150.8-148.5 millones de años, aunque restos más fragmentarios se " +
                            "han identificado en otras partes de Europa y en África.")
                    .itemMainContent("Era un carnívoro y probablemente cazaba peces y otros animales pequeños. Como todos los pterosaurios, " +
                            "las alas de Pterodactylus estaban formadas por una membrana de músculo y piel que se extendía desde su alargado " +
                            "cuarto dedo hasta sus miembros posteriores. Esta era mantenida internamente por fibras de colágeno y externamente " +
                            "por bordes queratinosos.\n" +
                            "Los cráneos de los Pterodactylus adultos eran largos y estrechos con cerca de 90 grandes dientes cónicos. Los dientes " +
                            "se extendían desde la punta de ambas mandíbulas, y se volvían más pequeños a medida que se alejaban de las puntas de las" +
                            " mandíbulas (a diferencia de algunos de sus parientes, en los cuales los dientes estaban ausentes en la punta de la " +
                            "mandíbula superior y eran relativamente uniformes en tamaño). Los dientes se extendían más atrás en la mandíbula que " +
                            "en sus parientes cercanos, y algunos estaban presentes debajo del frente de la fenestra nasoanteorbital, la gran " +
                            "abertura presente en el cráneo. A diferencia de las especies relacionadas, el cráneo y la mandíbula eran rectos, " +
                            "sin curvarse hacia arriba.")
                    .itemMainPicture("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Pterodactylus_antiquus_-_IMG_0681.jpg/250px-Pterodactylus_antiquus_-_IMG_0681.jpg")
//                    .itemGallery(list)
                    .itemYoutube("https://www.youtube.com/watch?v=xUoN0-Y9dGc")
                    .itemTags("Dinosaurios - Jurásico")
                    .itemExternalLinks(links)
                    .itemLat("-")
                    .itemLong("-")
                    .itemAudioLink("")
                    .build());

            links = new ArrayList<>();

            links.add(ItemExternalLink.builder()
                    .url("https://es.wikipedia.org/wiki/Momias_de_Llullaillaco")
                    .name("Wiki").build());

            links.add(ItemExternalLink.builder()
                    .url("https://www.nationalgeographic.es/historia/los-ninos-incas-sacrificados-ritualmente-estaban-drogados")
                    .name("NatGeo").build());

            items.add(ItemMuseo.builder()
                    .itemTitle("Momias de Llullaillaco")
                    .roomName("Sala 3")
                    .itemIntro("Las Momias de Llullaillaco, también llamadas Niños de Llullaillaco y Niños del volcán, son los nombres con " +
                            "que se conocen los cuerpos de tres niños sacrificados por los incas excepcionalmente conservados por alrededor " +
                            "de quinientos años.")
                    .itemMainContent("En marzo de 1999 fueron encontrados los cuerpos de un niño de siete años («El niño»), una niña de seis " +
                            "(«La niña del rayo») y una joven mujer de quince años («La doncella»). Su estado de conservación era tal, que " +
                            "varios expedicionarios coincidieron en afirmar que parecían estar dormidos. Junto a ellos se hallaron 46 objetos " +
                            "que componían su ajuar, formado por figuras humanas y animales en miniatura, utensilios y alimentos.\n" +
                            "Las tres momias incas encontradas cerca de la majestuosa cima del volcán Llullaillaco, en Argentina, estaban un " +
                            "estado de conservación tan bueno que nos permitieron ponerle cara al antiguo ritual de la capaccocha, cuyo colofón " +
                            "fue el sacrificio de los niños. Se cree que fue un sacrificio, ya que 'La Doncella' estaba vestida con un vestido " +
                            "marrón claro ajustado en la cintura por una faja con dibujos geométricos donde combinan colores claros y oscuros " +
                            "con sus bordes rojos. Tiene un manto gris con guardas rojas,sostenida por un prendedor de plata a la altura del " +
                            "tórax, al igual que con muchas trenzas y como era de costumbre, adornos en la cabeza. 'La Niña del Rayo' y 'El niño' " +
                            "estaban de una forma en la que no se podía percibir las prendas fácilmente.")
                    .itemMainPicture("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Llullaillaco_mummies_in_Salta_city%2C_Argentina.jpg/250px-Llullaillaco_mummies_in_Salta_city%2C_Argentina.jpg")
//                    .itemGallery(list)
                    .itemYoutube("https://www.youtube.com/watch?v=iOte8C7G998")
                    .itemTags("Momias - Salta")
                    .itemExternalLinks(links)
                    .itemLat("24°43′12″S")
                    .itemLong("68°32′13″O")
                    .itemAudioLink("")
                    .build());

            links = new ArrayList<>();

            links.add(ItemExternalLink.builder()
                    .url("https://es.wikipedia.org/wiki/Mammut")
                    .name("Wiki").build());

            links.add(ItemExternalLink.builder()
                    .url("https://historia.nationalgeographic.com.es/a/mamut-rey-animales-edad-hielo_13878")
                    .name("NatGeo").build());

            items.add(ItemMuseo.builder()
                    .itemTitle("Mammut")
                    .roomName("Sala 4")
                    .itemIntro("Mammut es un género extinto de mamíferos proboscídeos de la familia Mammutidae, una de las familias conocidas " +
                            "comúnmente como mastodontes.")
                    .itemMainContent("Habitaron predominantemente en América del Norte desde su aparición en el Mioceno tardío hasta su " +
                            "extinción al final del Pleistoceno, hace 11 000 años. Se piensa que los mastodontes vivían en manadas, tal como " +
                            "lo hacen los elefantes actuales, pero a diferencia de éstos, los mastodontes eran habitantes de los bosques que " +
                            "subsistían en una dieta mixta de ramoneo y pastoreo, con una preferencia estacional por el ramoneo, en contraste a " +
                            "los elefantes actuales que son principalmente de pastoreo.\n" +
                            "El mastodonte americano es la especie más reciente y conocida del género. Se piensa que desaparecieron de América " +
                            "del Norte como parte de una extinción en masa que abarcó a la mayoría de la megafauna del Pleistoceno, ampliamente " +
                            "atribuida al resultado de un rápido cambio climático aunado a la sofisticación de las armas de piedra usadas por los " +
                            "cazadores Clovis, que podría haber causado una gradual reducción de la población del mastodonte.")
                    .itemMainPicture("https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Mammut_americanum_Sergiodlarosa.jpg/250px-Mammut_americanum_Sergiodlarosa.jpg")
//                    .itemGallery(list)
                    .itemYoutube("https://www.youtube.com/watch?v=ACISJgIhsMQ")
                    .itemTags("Mamut - América")
                    .itemExternalLinks(links)
                    .itemLat("-")
                    .itemLong("-")
                    .itemAudioLink("")
                    .build());


            links = new ArrayList<>();

            links.add(ItemExternalLink.builder()
                    .url("https://es.wikipedia.org/wiki/El_grito")
                    .name("Wiki").build());

            items.add(ItemMuseo.builder()
                    .itemTitle("El grito")
                    .roomName("Sala 5")
                    .itemIntro("El grito (en noruego Skrik) es el título de cuatro cuadros del noruego Edvard Munch (1863-1944). La versión más " +
                            "famosa se encuentra en la Galería Nacional de Noruega y fue completada en 1893. Otras dos versiones del cuadro se " +
                            "encuentran en el Museo Munch, también en Oslo, mientras que la cuarta versión pertenece a una colección particular. " +
                            "En 1895, Munch realizó también una litografía con el mismo título.")
                    .itemMainContent("En los últimos años, la obra, en dos versiones diferentes, ha sido objeto de robos de gran repercusión " +
                            "mediática. La versión más conocida, la de la Galería Nacional, fue robada en febrero de 1994, y fue recuperada en una " +
                            "acción policial doce semanas más tarde. En agosto de 2004 se produjo el robo de una de las versiones expuestas en el " +
                            "Museo Munch. Dos años después, el 31 de agosto de 2006 la policía noruega anunció la recuperación de la pintura, en " +
                            "buen estado.\n La versión que llevaba 70 años en manos del noruego Petter Olsen, cuyo padre había sido vecino, amigo " +
                            "y luego mecenas de Munch, fue subastada el 2 de mayo de 2012 por 119,9 millones de dólares, en la casa Sotheby's de " +
                            "Nueva York, convirtiéndose así en la obra más cara vendida en una subasta.\n" +
                            "Todas las versiones del cuadro muestran una figura andrógina en primer plano, que simboliza a un hombre moderno en un " +
                            "momento de profunda angustia y desesperación existencial. El paisaje del fondo es Oslo visto desde la colina de Ekeberg. " +
                            "El grito está considerado como una de las más importantes obras del artista y del movimiento expresionista, constituyendo " +
                            "una imagen de icono cultural, semejante al de la Gioconda de Leonardo da Vinci.")
                    .itemMainPicture("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/The_Scream_by_Edvard_Munch%2C_1893_-_Nasjonalgalleriet.png/250px-The_Scream_by_Edvard_Munch%2C_1893_-_Nasjonalgalleriet.png")
//                    .itemGallery(list)
                    .itemYoutube("https://www.youtube.com/watch?v=ACISJgIhsMQ")
                    .itemTags("Arte - El grito")
                    .itemExternalLinks(links)
                    .itemLat("-")
                    .itemLong("-")
                    .itemAudioLink("")
                    .build());


            links = new ArrayList<>();

            links.add(ItemExternalLink.builder()
                    .url("https://es.wikipedia.org/wiki/Peter_K%C3%BCrten")
                    .name("Wiki").build());

            links.add(ItemExternalLink.builder()
                    .url("https://historia.nationalgeographic.com.es/a/peter-kurten-vampiro-dusseldorf_15692")
                    .name("NatGeo").build());

            items.add(ItemMuseo.builder()
                    .itemTitle("La cabeza del vampiro de Düsseldorf")
                    .roomName("Sala 6")
                    .itemIntro("La pieza descansa tras una cristalera junto a un cartel que explica la historia del asesino que aterrorizó a Alemania.")
                    .itemMainContent("Peter Kürten (Mülheim, 26 de mayo de 1883 - Colonia, 2 de julio de 1931) fue un asesino en serie alemán, más " +
                            "conocido como El vampiro de Düsseldorf (Der Vampir von Düsseldorf). Alcanzó fama mundial por los asesinatos en serie y " +
                            "los asaltos sexuales que llevó a cabo entre febrero y noviembre de 1929 en la ciudad de Düsseldorf, los cuales también " +
                            "hicieron famosa a esta ciudad fuera de Alemania. Kürten ganó la fama de \"vampiro\" al afirmar durante su juicio que " +
                            "había bebido la sangre de algunas de sus víctimas.\n" +
                            "Kürten nació en la localidad de Mülheim (ahora distrito de la ciudad alemana de Colonia) y fue el tercero de trece " +
                            "hermanos en el seno de una familia extremadamente pobre. Peter presenció cómo su padre, un alcohólico y violento " +
                            "trabajador en paro, maltrataba a su madre e, incluso, violaba con total impunidad a algunas de sus hermanas menores. " +
                            "Así fue como a la edad de ocho años, Kürten se escapó de su hogar familiar y dirigió sus pasos al mundo de la delincuencia " +
                            "en la ciudad de Düsseldorf.\n" +
                            "Se cree que a los nueve años realizó sus primeros asesinatos, cuando ahogó a dos niños mientras se bañaban en el Rin. A " +
                            "excepción de estos dos casos aislados, Kürten fue intercalando sus pequeños actos de delincuencia con breves pasos por " +
                            "la cárcel para pagar sus fechorías. También fue contratado como perrero donde experimentó el \"placer\" de torturar, " +
                            "violar y matar a perros abandonados. No fue el único caso en la vida de Kürten donde experimentaría experiencias sexuales " +
                            "y torturas a animales.\n" +
                            "En mayo de 1930, Kürten cometió el error garrafal que le acabaría condenando. Kürten engañó a Maria Budlick, una empleada " +
                            "doméstica, para llevarla a Grafenberger, un bosque de las cercanías. El malhechor estranguló a su víctima para agredirla " +
                            "sexualmente pero la dejó con vida después de experimentar el orgasmo. Al marcharse el asesino, Budlick acudió a la policía " +
                            "donde pudo dar información precisa sobre Kürten. Poco después, aparecía el retrato robot del hombre más buscado de Alemania.\n" +
                            "Víctima de un gran miedo, Kürten ofreció a su esposa la posibilidad de delatarle, con la creencia de que recibiría la " +
                            "suculenta suma de dinero que suponía la recompensa por su cabeza. Así, el 24 de mayo el vampiro de Düsseldorf fue " +
                            "localizado y arrestado. Kürten confesó haber cometido setenta y nueve delitos, aunque sería acusado solamente de nueve " +
                            "asesinatos y de siete intentos de asesinato. En el juicio posterior (abril de 1931), inicialmente se declaró inocente. " +
                            "Pero a medida que iba transcurriendo el pleito, cambió de idea. De hecho los psicoanalistas trabajaron duro para deshacer " +
                            "cualquier tipo de enajenación que le pudieran salvar de la pena de muerte. La sentencia fue morir guillotinado por nueve " +
                            "asesinatos, siete intentos frustrados y no menos de ochenta agresiones sexuales.\n" +
                            "Peter Kürten fue ejecutado en Colonia el 2 de julio de 1931.\n" +
                            "Tras su ejecución, su cabeza fue diseccionada y momificada, y en la actualidad se conserva en el Museo Ripley's de " +
                            "Wisconsin Dells, en Estados Unidos.\n")
                    .itemMainPicture("https://www.elciudadano.com/wp-content/uploads/2018/07/kurten-ripleys.jpg")
//                    .itemGallery(list)
                    .itemYoutube("https://www.youtube.com/watch?v=VvbQF1QyYWs&ab_channel=ElRinc%C3%B3nProfano")
                    .itemTags("Criminología - Asesino serial")
                    .itemExternalLinks(links)
                    .itemLat("-")
                    .itemLong("-")
                    .itemAudioLink("")
                    .build());


            links = new ArrayList<>();

            links.add(ItemExternalLink.builder()
                    .url("https://es.wikipedia.org/wiki/M%C3%A1scara_de_Agamen%C3%B3n")
                    .name("Wiki").build());

            links.add(ItemExternalLink.builder()
                    .url("https://historia.nationalgeographic.com.es/a/rostro-imperecedero_9901")
                    .name("NatGeo").build());

            links.add(ItemExternalLink.builder()
                    .url("https://www.lavanguardia.com/historiayvida/historia-antigua/20210518/7460762/cuestionada-mascara-agamenon.html")
                    .name("Info").build());

            items.add(ItemMuseo.builder()
                    .itemTitle("Máscara de Agamenón")
                    .roomName("Sala 7")
                    .itemIntro("Máscara funeraria de oro encontrada encima de la cara de un cuerpo ubicado en la tumba V del Círculo de tumbas A.")
                    .itemMainContent("Schliemann pensó que había descubierto el cuerpo del legendario rey griego Agamenón, y por ese motivo la " +
                            "máscara recibió su nombre. Sin embargo, estudios arqueológicos modernos sugieren que la máscara podría datar de entre " +
                            "1550 y 1500 a. C., lo que la situaría en un tiempo anterior (unos 300 años) al que tradicionalmente se atribuye a la " +
                            "vida de Agamenón. A pesar de ello, ha conservado su nombre.\n" +
                            "La máscara de Agamenón es una de las cinco descubiertas en el Círculo de tumbas A, tres fueron encontradas en la " +
                            "tumba IV y en la tumba V se encontraron dos. Además, las caras y manos de dos niños de la tumba III se encontraban " +
                            "cubiertos por una hoja de oro, de las cuales una tenía agujeros para los ojos.\n" +
                            "Las tumbas son ciertamente de carácter real. Las caras de los hombres no estaban todas cubiertas por máscaras, y el " +
                            "hecho de que se tratase de guerreros lo indica la presencia de armas en sus tumbas. Las cantidades de oro y de objetos " +
                            "de cuidado diseño denotan honor, riqueza y estatus socia\n")
                    .itemMainPicture("https://historia.nationalgeographic.com.es/medio/2018/02/28/mascara-de-agamenon__1280x879.JPG")
//                    .itemGallery(list)
                    .itemYoutube("https://www.youtube.com/watch?v=r_XKmBZpjM8&ab_channel=EstoesArgos%21")
                    .itemTags("Agamenón - Grecia")
                    .itemExternalLinks(links)
                    .itemLat("-")
                    .itemLong("-")
                    .itemAudioLink("")
                    .build());



            links = new ArrayList<>();

            links.add(ItemExternalLink.builder()
                    .url("https://es.wikipedia.org/wiki/Estatua_de_Am%C3%B3n_como_carnero_protegiendo_al_fara%C3%B3n_Taharqo")
                    .name("Wiki").build());

            items.add(ItemMuseo.builder()
                    .itemTitle("Estatua de Amón")
                    .roomName("Sala 8")
                    .itemIntro("La estatua de Amón como carnero protegiendo al faraón Taharqo")
                    .itemMainContent("La estatua de Amón como carnero protegiendo al faraón Taharqo es una escultura creada durante la dinastía XXV " +
                            "de Egipto o Kushita, perteneciente al Tercer periodo intermedio de Egipto. \n" +
                            "Es del estilo de escultura del Antiguo Egipto con influencias kushitas, está construido en piedra arenisca y tiene una " +
                            "altura máxima de 106 centímetros, una base con una longitud de 163 centímetros y una base con una anchura de 63 centímetros.\n" +
                            "La escultura procede de un templo de Kawa, situado en Nubia Superior, (Sudán), y fue hallada en unas excavaciones " +
                            "dirigidas por el profesor-egiptólogo británico, Francis Lllewellyn Griffith (1862–1934).\n" +
                            "El carnero representa a Amón, «El oculto», símbolo del poder creador y «Padre de todos los vientos» en la mitología " +
                            "egipcia, originalmente una deidad tebana, cuyo culto se popularizó cuando la ciudad de Tebas pasó a ser una de las " +
                            "más influyentes de Egipto, tras la expulsión de los hicsos a manos de los príncipes tebanos que darían origen a la " +
                            "dinastía XVII.\n" +
                            "La figura pequeña representa a Taharqo, Nefertumjura Taharqo, rey de la dinastía XXV de Egipto, o Kushita, cuyo reinado " +
                            "se data de. 690 a. C. a 664 a. C.; Manetón lo denominó Tarcos, comentando que reinó 18 años (Julio Africano), Eusebio de " +
                            "Cesarea lo llama Taracos (según Jorge Sincelo) o Saraco (versión armenia) asignándole veinte años de reinado, y además " +
                            "era hermano de Shabitko, el rey precedente, e hijo de Piye, rey nubio de Napata que conquistó Egipto.\n")
                    .itemMainPicture("https://gov-civ-guarda.pt/img/philosophy-religion/48/amon.jpg")
//                    .itemGallery(list)
                    .itemYoutube("https://www.youtube.com/watch?v=6JxZo3fO7C8&ab_channel=DecorarconArte")
                    .itemTags("Egipto - Arqueología")
                    .itemExternalLinks(links)
                    .itemLat("-")
                    .itemLong("-")
                    .itemAudioLink("")
                    .build());



            links = new ArrayList<>();

            links.add(ItemExternalLink.builder()
                    .url("https://es.wikipedia.org/wiki/Piedra_de_Rosetta")
                    .name("Wiki").build());

            links.add(ItemExternalLink.builder()
                    .url("https://historia.nationalgeographic.com.es/a/asi-fue-descubrimiento-piedra-rosetta_7462")
                    .name("NatGeo").build());

            links.add(ItemExternalLink.builder()
                    .url("https://www.lavanguardia.com/vida/junior-report/20210715/7599198/piedra-rosetta-clave-descifrar-jeroglificos.html")
                    .name("Info").build());

            items.add(ItemMuseo.builder()
                    .itemTitle("Piedra de Rosetta")
                    .roomName("Sala 9")
                    .itemIntro("La piedra de Rosetta es un fragmento de una antigua estela egipcia de granodiorita inscrita con un decreto publicado " +
                            "en Menfis en el año 196 a. C. en nombre del faraón Ptolomeo V.")
                    .itemMainContent("El decreto aparece en tres escrituras distintas: el texto superior en jeroglíficos egipcios, la parte intermedia " +
                            "en escritura demótica y la inferior en griego antiguo. Gracias a que presenta esencialmente el mismo contenido en las tres " +
                            "inscripciones, con diferencias menores entre ellas, esta piedra facilitó la clave para el desciframiento moderno de los " +
                            "jeroglíficos egipcios.\n" +
                            "La estela fue tallada en el período helenístico y se piensa que originalmente estuvo expuesta dentro de un templo, " +
                            "posiblemente en la cercana Sais. Fue probablemente trasladada al final de la Antigüedad o durante el sultanato mameluco " +
                            "de Egipto y finalmente usada como material de construcción en un fuerte cerca de la localidad de Rashid (Rosetta), en el " +
                            "delta del Nilo. Allí fue hallada el 15 de julio de 1799 por el soldado Pierre-François Bouchard durante la campaña " +
                            "francesa en Egipto. Debido a que fue el primer texto plurilingüe antiguo descubierto en tiempos modernos, la Piedra de " +
                            "Rosetta despertó el interés público por su potencial para descifrar la hasta entonces ininteligible escritura jeroglífica " +
                            "egipcia, y en consecuencia sus copias litográficas y de yeso comenzaron a circular entre los museos y los eruditos europeos. " +
                            "Los británicos derrotaron a los franceses en Egipto y la piedra fue transportada a Londres tras la firma de la Capitulación " +
                            "de Alejandría en 1801. Ha estado expuesta al público desde 1802 en el Museo Británico, donde es la pieza más visitada.\n" +
                            "La primera traducción completa del texto en griego antiguo apareció en 1803. En 1822, el egiptólogo francés Jean-François " +
                            "Champollion anunció en París el descifrado de los textos jeroglíficos egipcios, pero los lingüistas tardarían todavía un " +
                            "tiempo en leer con seguridad otras inscripciones y textos del antiguo Egipto. Los principales avances de la decodificación " +
                            "fueron el reconocimiento de que la estela ofrece tres versiones del mismo texto (1799), que el texto demótico usa caracteres " +
                            "fonéticos para escribir nombres extranjeros (1802), que el texto jeroglífico también lo hace así y tiene similitudes " +
                            "generales con el demótico —Thomas Young en 1814— y que, además de ser usados para los nombres extranjeros, los caracteres " +
                            "fonéticos también fueron usados para escribir palabras nativas egipcias —Champollion entre 1822 y 1824—.\n")
                    .itemMainPicture("https://historia.nationalgeographic.com.es/medio/2017/01/30/museo-britanico-londres_00c00d98.jpg")
//                    .itemGallery(list)
                    .itemYoutube("https://www.youtube.com/watch?v=DGGF_sTKLNQ&ab_channel=Docutami")
                    .itemTags("Egipto - Arqueología")
                    .itemExternalLinks(links)
                    .itemLat("-")
                    .itemLong("-")
                    .itemAudioLink("")
                    .build());

            this.itemMuseoRepository.saveAll(items);
        }

    }
}
