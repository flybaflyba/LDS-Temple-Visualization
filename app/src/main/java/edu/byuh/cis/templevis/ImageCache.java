package edu.byuh.cis.templevis;


import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;


import edu.byuh.cis.templevis.R;

import java.util.ArrayList;

public class ImageCache {



    private static ArrayList<Bitmap> templesList;
    private static ArrayList<Integer> allImageIds;
    private static ArrayList<Integer> allTempleInfoFileIds;
    private static float screenWidth, screenHeight;

    private static ArrayList<Integer> allSpiralImageIds;

    private static Bitmap kirtland_temple, old_nauvoo_temple, st_george_temple, logan_temple, manti_temple, salt_lake_temple, laie_hawaii_temple, cardston_alberta_temple, mesa_temple, idaho_falls_temple, bern_switzerland_temple, los_angeles_temple, hamilton_new_zealand_temple, london_england_temple, oakland_temple, ogden_utah_temple, provo_temple, washington_dc_temple, sao_paulo_brazil_temple, tokyo_japan_temple, seattle_temple, jordan_river_temple, atlanta_temple, apia_samoa_temple, nukualofa_tonga_temple, santiago_chile_temple, papeete_tahiti_temple, mexico_city_temple, boise_idaho_temple, sydney_australia_temple, manila_philippines_temple, dallas_texas_temple, taipei_taiwan_temple, guatemala_lds_temple, freiberg_germany_temple, stockholm_sweden_lds_temple, chicago_temple, johannesburg_south_africa_temple, seoul_korea_temple, lima_peru_temple, buenos_aires_argentina_temple, denver_colorado_templ, frankfurt_germany_temple, portland_oregon_temple, las_vegas_temple, toronto_temple, san_diego_california_temple, orlando_temple, bountiful_temple, hong_kong_china_temple, mount_timpanogos_utah_temple, st_louis_temple, vernal_temple, preston_england_temple, monticello_utah_temple, anchorage_alaska_temple, colonia_juarez_mexico_temple, madrid_spain_temple, bogota_colombia_temple, guayaquil_ecuador_temple, spokane_washington_temple, columbus_ohio_temple, bismark_north_dakota_temple, columbia_temple, detroit_temple, halifax_nova_scotia_lds_temple, regina_temple, billings_montana_temple, edmonton_alberta_temple, raleigh_north_carolina_temple, st_paul_temple, kona_temple, ciudad_juarez_mexico_temple, hermosillo_sonora_mexico_temple, albuquerque_temple, oaxaca_mexico_temple, tuxtla_guitierrez_mexico_temple, louisville_temple, palmyra_temple, fresno_temple, medford_temple, memphis_tennessee_temple, reno_nevada_lds_temple, cochabamba_bolivia_temple, tampico_mexico_temple, nashville_temple, villahermosa_mexico_temple, montreal_quebec_temple, san_jose_costa_rica_temple, fukuoka_japan_temple, adelaide_australia_temple, melbourne_australia_temple, suva_fiji_temple, merida_mexico_temple, veracruz_mexico_temple, baton_rouge_louisiana_temple, oklahoma_city_temple, caracas_venezuela_temple, houston_texas_temple, birmingham_alabama_temple, santo_domingo_dominican_republic_temple, boston_temple, recife_brazil_temple, porto_alegre_brazil_temple, montevideo_uruguay_temple, winter_quarters_temple, guadalajara_temple, perth_australia_temple, columbia_river_temple, snowflake_temple, lubbock_temple, monterrey_mexico_temple, campinas_brazil_temple, asuncion_paraguay_temple, nauvoo_temple, the_hague_netherlands_temple, brisbane_australia_temple, redlands_temple, accra_ghana_temple, copenhagen_denmark_temple, manhattan_temple, san_antonio_temple, aba_nigeria_temple, newport_beach_california_temple, sacramento_temple, helsinki_finland_temple, rexburg_idaho_temple, curitiba_brazil_temple, panama_city_temple, twin_falls_temple, draper_utah_temple, oquirrh_mountain_utah_temple, vancouver_temple, gila_valley_temple, cebu_philippines_temple, kyiv_ukraine_temple, san_salvador_el_salvador_temple, quetzaltenango_guatemala_temple, kansas_city_temple, manaus_brazil_temple, brigham_city_utah_temple, calgary_alberta_lds_temple, tegucigalpa_honduras_temple, gilbert_arizona_temple, fort_lauderdale_florida_temple, phoenix_arizona_temple, cordoba_argentina_temple, payson_utah_temple, trujillo_peru_temple, indianapolis_indiana_temple, tijuana_mexico_temple, provo_city_center_temple, sapporo_japan_temple, philadelphia_pennsylvania_temple, fort_collins_colorado_temple, star_valley_wyoming_temple, hartford_connecticut_temple, paris_france_temple, tucson_arizona_temple, meridian_idaho_temple, cedar_city_utah_temple, concepcion_chile_temple, barranquilla_columbia_temple, rome_italy_temple, kinshasa_temple, fortaleza_brazil_temple, haiti_temple_exterior, lisbon_portugal_temple, arequipa_peru_temple, durban_south_africa_temple;

    private static Bitmap
            abidjan_ivory_coast_temple,
            bangkok_thailand_temple,
            belem_brazil_temple,
            lima_peru_los_olivos_temple,
            pocatello_idaho_temple,
            praia_cape_verde_temple,
            puebla_mexico_temple,
            quito_ecuador_temple,
            richmond_virginia_temple,
            rio_de_janeiro_brazil_temple,
            san_juan_puerto_rico_temple,
            saratoga_springs_utah_temple,
            urdaneta_philippines_temple,
            winnipeg_manitoba_temple,
            yigo_guam_temple,
            alabang_philippines_temple,
            antofagasta_chile_temple,
            auckland_new_zealand_temple,
            bacolod_philippines_temple,
            bahia_blanca_argentina_temple,
            bengaluru_india_temple,
            benin_city_nigeria_temple,
            bentonville_arkansas_temple,
            brasilia_brazil_temple,
            budapest_hungary_temple,
            cagayan_de_oro_philippines_temple,
            coban_guatemala_temple,
            davao_philippines_temple,
            dubai_united_arab_emirates_temple,
            feather_river_california_temple,
            freetown_sierra_leone_temple,
            harare_zimbabwe_temple,
            lagos_nigeria_temple,
            layton_utah_temple,
            lubumbashi_democratic_republic_of_the_congo_temple,
            managua_nicaragua_temple,
            mcallen_texas_temple,
            mendoza_argentina_temple,
            moses_lake_washington_temple,
            nairobi_kenya_temple,
            neiafu_tonga_temple,
            okinawa_city_okinawa_temple,
            orem_utah_temple,
            pago_pago_american_samoa_temple,
            phnom_penh_cambodia_temple,
            pittsburgh_pennsylvania_temple,
            port_moresby_papua_new_guinea_temple,
            russia_temple,
            salta_argentina_temple,
            salvador_brazil_temple,
            san_pedro_sula_honduras_temple,
            syracuse_utah_temple,
            tallahassee_florida_temple,
            taylorsville_utah_temple,
            tooele_valley_utah_temple,
            washington_county_utah_temple,
            shanghai_china_temple;

    private static Bitmap logo_circle;

    public static void init(Resources res, float w2, float h) {
        float w = w2 / 4;

        logo_circle = loadAndScale(res, R.drawable.logo_circle, w);

        kirtland_temple = loadAndScale(res, R.drawable.kirtland_temple, w);
        old_nauvoo_temple = loadAndScale(res, R.drawable.old_nauvoo_temple, w);
        st_george_temple = loadAndScale(res, R.drawable.st_george_temple, w);
        logan_temple = loadAndScale(res, R.drawable.logan_temple, w);
        manti_temple = loadAndScale(res, R.drawable.manti_temple, w);
        salt_lake_temple = loadAndScale(res, R.drawable.salt_lake_temple, w);
        laie_hawaii_temple = loadAndScale(res, R.drawable.laie_hawaii_temple, w);
        cardston_alberta_temple = loadAndScale(res, R.drawable.cardston_alberta_temple, w);
        mesa_temple = loadAndScale(res, R.drawable.mesa_temple, w);
        idaho_falls_temple = loadAndScale(res, R.drawable.idaho_falls_temple, w);
        bern_switzerland_temple = loadAndScale(res, R.drawable.bern_switzerland_temple, w);
        los_angeles_temple = loadAndScale(res, R.drawable.los_angeles_temple, w);
        hamilton_new_zealand_temple = loadAndScale(res, R.drawable.hamilton_new_zealand_temple, w);
        london_england_temple = loadAndScale(res, R.drawable.london_england_temple, w);
        oakland_temple = loadAndScale(res, R.drawable.oakland_temple, w);
        ogden_utah_temple = loadAndScale(res, R.drawable.ogden_utah_temple, w);
        provo_temple = loadAndScale(res, R.drawable.provo_temple, w);
        washington_dc_temple = loadAndScale(res, R.drawable.washington_dc_temple, w);
        sao_paulo_brazil_temple = loadAndScale(res, R.drawable.sao_paulo_brazil_temple, w);
        tokyo_japan_temple = loadAndScale(res, R.drawable.tokyo_japan_temple, w);
        seattle_temple = loadAndScale(res, R.drawable.seattle_temple, w);
        jordan_river_temple = loadAndScale(res, R.drawable.jordan_river_temple, w);
        atlanta_temple = loadAndScale(res, R.drawable.atlanta_temple, w);
        apia_samoa_temple = loadAndScale(res, R.drawable.apia_samoa_temple, w);
        nukualofa_tonga_temple = loadAndScale(res, R.drawable.nukualofa_tonga_temple, w);
        santiago_chile_temple = loadAndScale(res, R.drawable.santiago_chile_temple, w);
        papeete_tahiti_temple = loadAndScale(res, R.drawable.papeete_tahiti_temple, w);
        mexico_city_temple = loadAndScale(res, R.drawable.mexico_city_temple, w);
        boise_idaho_temple = loadAndScale(res, R.drawable.boise_idaho_temple, w);
        sydney_australia_temple = loadAndScale(res, R.drawable.sydney_australia_temple, w);
        manila_philippines_temple = loadAndScale(res, R.drawable.manila_philippines_temple, w);
        dallas_texas_temple = loadAndScale(res, R.drawable.dallas_texas_temple, w);
        taipei_taiwan_temple = loadAndScale(res, R.drawable.taipei_taiwan_temple, w);
        guatemala_lds_temple = loadAndScale(res, R.drawable.guatemala_lds_temple, w);
        freiberg_germany_temple = loadAndScale(res, R.drawable.freiberg_germany_temple, w);
        stockholm_sweden_lds_temple = loadAndScale(res, R.drawable.stockholm_sweden_lds_temple, w);
        chicago_temple = loadAndScale(res, R.drawable.chicago_temple, w);
        johannesburg_south_africa_temple = loadAndScale(res, R.drawable.johannesburg_south_africa_temple, w);
        seoul_korea_temple = loadAndScale(res, R.drawable.seoul_korea_temple, w);
        lima_peru_temple = loadAndScale(res, R.drawable.lima_peru_temple, w);
        buenos_aires_argentina_temple = loadAndScale(res, R.drawable.buenos_aires_argentina_temple, w);
        denver_colorado_templ = loadAndScale(res, R.drawable.denver_colorado_templ, w);
        frankfurt_germany_temple = loadAndScale(res, R.drawable.frankfurt_germany_temple, w);
        portland_oregon_temple = loadAndScale(res, R.drawable.portland_oregon_temple, w);
        las_vegas_temple = loadAndScale(res, R.drawable.las_vegas_temple, w);
        toronto_temple = loadAndScale(res, R.drawable.toronto_temple, w);
        san_diego_california_temple = loadAndScale(res, R.drawable.san_diego_california_temple, w);
        orlando_temple = loadAndScale(res, R.drawable.orlando_temple, w);
        bountiful_temple = loadAndScale(res, R.drawable.bountiful_temple, w);
        hong_kong_china_temple = loadAndScale(res, R.drawable.hong_kong_china_temple, w);
        mount_timpanogos_utah_temple = loadAndScale(res, R.drawable.mount_timpanogos_utah_temple, w);
        st_louis_temple = loadAndScale(res, R.drawable.st_louis_temple, w);
        vernal_temple = loadAndScale(res, R.drawable.vernal_temple, w);
        preston_england_temple = loadAndScale(res, R.drawable.preston_england_temple, w);
        monticello_utah_temple = loadAndScale(res, R.drawable.monticello_utah_temple, w);
        anchorage_alaska_temple = loadAndScale(res, R.drawable.anchorage_alaska_temple, w);
        colonia_juarez_mexico_temple = loadAndScale(res, R.drawable.colonia_juarez_mexico_temple, w);
        madrid_spain_temple = loadAndScale(res, R.drawable.madrid_spain_temple, w);
        bogota_colombia_temple = loadAndScale(res, R.drawable.bogota_colombia_temple, w);
        guayaquil_ecuador_temple = loadAndScale(res, R.drawable.guayaquil_ecuador_temple, w);
        spokane_washington_temple = loadAndScale(res, R.drawable.spokane_washington_temple, w);
        columbus_ohio_temple = loadAndScale(res, R.drawable.columbus_ohio_temple, w);
        bismark_north_dakota_temple = loadAndScale(res, R.drawable.bismark_north_dakota_temple, w);
        columbia_temple = loadAndScale(res, R.drawable.columbia_temple, w);
        detroit_temple = loadAndScale(res, R.drawable.detroit_temple, w);
        halifax_nova_scotia_lds_temple = loadAndScale(res, R.drawable.halifax_nova_scotia_lds_temple, w);
        regina_temple = loadAndScale(res, R.drawable.regina_temple, w);
        billings_montana_temple = loadAndScale(res, R.drawable.billings_montana_temple, w);
        edmonton_alberta_temple = loadAndScale(res, R.drawable.edmonton_alberta_temple, w);
        raleigh_north_carolina_temple = loadAndScale(res, R.drawable.raleigh_north_carolina_temple, w);
        st_paul_temple = loadAndScale(res, R.drawable.st_paul_temple, w);
        kona_temple = loadAndScale(res, R.drawable.kona_temple, w);
        ciudad_juarez_mexico_temple = loadAndScale(res, R.drawable.ciudad_juarez_mexico_temple, w);
        hermosillo_sonora_mexico_temple = loadAndScale(res, R.drawable.hermosillo_sonora_mexico_temple, w);
        albuquerque_temple = loadAndScale(res, R.drawable.albuquerque_temple, w);
        oaxaca_mexico_temple = loadAndScale(res, R.drawable.oaxaca_mexico_temple, w);
        tuxtla_guitierrez_mexico_temple = loadAndScale(res, R.drawable.tuxtla_guitierrez_mexico_temple, w);
        louisville_temple = loadAndScale(res, R.drawable.louisville_temple, w);
        palmyra_temple = loadAndScale(res, R.drawable.palmyra_temple, w);
        fresno_temple = loadAndScale(res, R.drawable.fresno_temple, w);
        medford_temple = loadAndScale(res, R.drawable.medford_temple, w);
        memphis_tennessee_temple = loadAndScale(res, R.drawable.memphis_tennessee_temple, w);
        reno_nevada_lds_temple = loadAndScale(res, R.drawable.reno_nevada_lds_temple, w);
        cochabamba_bolivia_temple = loadAndScale(res, R.drawable.cochabamba_bolivia_temple, w);
        tampico_mexico_temple = loadAndScale(res, R.drawable.tampico_mexico_temple, w);
        nashville_temple = loadAndScale(res, R.drawable.nashville_temple, w);
        villahermosa_mexico_temple = loadAndScale(res, R.drawable.villahermosa_mexico_temple, w);
        montreal_quebec_temple = loadAndScale(res, R.drawable.montreal_quebec_temple, w);
        san_jose_costa_rica_temple = loadAndScale(res, R.drawable.san_jose_costa_rica_temple, w);
        fukuoka_japan_temple = loadAndScale(res, R.drawable.fukuoka_japan_temple, w);
        adelaide_australia_temple = loadAndScale(res, R.drawable.adelaide_australia_temple, w);
        melbourne_australia_temple = loadAndScale(res, R.drawable.melbourne_australia_temple, w);
        suva_fiji_temple = loadAndScale(res, R.drawable.suva_fiji_temple, w);
        merida_mexico_temple = loadAndScale(res, R.drawable.merida_mexico_temple, w);
        veracruz_mexico_temple = loadAndScale(res, R.drawable.veracruz_mexico_temple, w);
        baton_rouge_louisiana_temple = loadAndScale(res, R.drawable.baton_rouge_louisiana_temple, w);
        oklahoma_city_temple = loadAndScale(res, R.drawable.oklahoma_city_temple, w);
        caracas_venezuela_temple = loadAndScale(res, R.drawable.caracas_venezuela_temple, w);
        houston_texas_temple = loadAndScale(res, R.drawable.houston_texas_temple, w);
        birmingham_alabama_temple = loadAndScale(res, R.drawable.birmingham_alabama_temple, w);
        santo_domingo_dominican_republic_temple = loadAndScale(res, R.drawable.santo_domingo_dominican_republic_temple, w);
        boston_temple = loadAndScale(res, R.drawable.boston_temple, w);
        recife_brazil_temple = loadAndScale(res, R.drawable.recife_brazil_temple, w);
        porto_alegre_brazil_temple = loadAndScale(res, R.drawable.porto_alegre_brazil_temple, w);
        montevideo_uruguay_temple = loadAndScale(res, R.drawable.montevideo_uruguay_temple, w);
        winter_quarters_temple = loadAndScale(res, R.drawable.winter_quarters_temple, w);
        guadalajara_temple = loadAndScale(res, R.drawable.guadalajara_temple, w);
        perth_australia_temple = loadAndScale(res, R.drawable.perth_australia_temple, w);
        columbia_river_temple = loadAndScale(res, R.drawable.columbia_river_temple, w);
        snowflake_temple = loadAndScale(res, R.drawable.snowflake_temple, w);
        lubbock_temple = loadAndScale(res, R.drawable.lubbock_temple, w);
        monterrey_mexico_temple = loadAndScale(res, R.drawable.monterrey_mexico_temple, w);
        campinas_brazil_temple = loadAndScale(res, R.drawable.campinas_brazil_temple, w);
        asuncion_paraguay_temple = loadAndScale(res, R.drawable.asuncion_paraguay_temple, w);
        nauvoo_temple = loadAndScale(res, R.drawable.nauvoo_temple, w);
        the_hague_netherlands_temple = loadAndScale(res, R.drawable.the_hague_netherlands_temple, w);
        brisbane_australia_temple = loadAndScale(res, R.drawable.brisbane_australia_temple, w);
        redlands_temple = loadAndScale(res, R.drawable.redlands_temple, w);
        accra_ghana_temple = loadAndScale(res, R.drawable.accra_ghana_temple, w);
        copenhagen_denmark_temple = loadAndScale(res, R.drawable.copenhagen_denmark_temple, w);
        manhattan_temple = loadAndScale(res, R.drawable.manhattan_temple, w);
        san_antonio_temple = loadAndScale(res, R.drawable.san_antonio_temple, w);
        aba_nigeria_temple = loadAndScale(res, R.drawable.aba_nigeria_temple, w);
        newport_beach_california_temple = loadAndScale(res, R.drawable.newport_beach_california_temple, w);
        sacramento_temple = loadAndScale(res, R.drawable.sacramento_temple, w);
        helsinki_finland_temple = loadAndScale(res, R.drawable.helsinki_finland_temple, w);
        rexburg_idaho_temple = loadAndScale(res, R.drawable.rexburg_idaho_temple, w);
        curitiba_brazil_temple = loadAndScale(res, R.drawable.curitiba_brazil_temple, w);
        panama_city_temple = loadAndScale(res, R.drawable.panama_city_temple, w);
        twin_falls_temple = loadAndScale(res, R.drawable.twin_falls_temple, w);
        draper_utah_temple = loadAndScale(res, R.drawable.draper_utah_temple, w);
        oquirrh_mountain_utah_temple = loadAndScale(res, R.drawable.oquirrh_mountain_utah_temple, w);
        vancouver_temple = loadAndScale(res, R.drawable.vancouver_temple, w);
        gila_valley_temple = loadAndScale(res, R.drawable.gila_valley_temple, w);
        cebu_philippines_temple = loadAndScale(res, R.drawable.cebu_philippines_temple, w);
        kyiv_ukraine_temple = loadAndScale(res, R.drawable.kyiv_ukraine_temple, w);
        san_salvador_el_salvador_temple = loadAndScale(res, R.drawable.san_salvador_el_salvador_temple, w);
        quetzaltenango_guatemala_temple = loadAndScale(res, R.drawable.quetzaltenango_guatemala_temple, w);
        kansas_city_temple = loadAndScale(res, R.drawable.kansas_city_temple, w);
        manaus_brazil_temple = loadAndScale(res, R.drawable.manaus_brazil_temple, w);
        brigham_city_utah_temple = loadAndScale(res, R.drawable.brigham_city_utah_temple, w);
        calgary_alberta_lds_temple = loadAndScale(res, R.drawable.calgary_alberta_lds_temple, w);
        tegucigalpa_honduras_temple = loadAndScale(res, R.drawable.tegucigalpa_honduras_temple, w);
        gilbert_arizona_temple = loadAndScale(res, R.drawable.gilbert_arizona_temple, w);
        fort_lauderdale_florida_temple = loadAndScale(res, R.drawable.fort_lauderdale_florida_temple, w);
        phoenix_arizona_temple = loadAndScale(res, R.drawable.phoenix_arizona_temple, w);
        cordoba_argentina_temple = loadAndScale(res, R.drawable.cordoba_argentina_temple, w);
        payson_utah_temple = loadAndScale(res, R.drawable.payson_utah_temple, w);
        trujillo_peru_temple = loadAndScale(res, R.drawable.trujillo_peru_temple, w);
        indianapolis_indiana_temple = loadAndScale(res, R.drawable.indianapolis_indiana_temple, w);
        tijuana_mexico_temple = loadAndScale(res, R.drawable.tijuana_mexico_temple, w);
        provo_city_center_temple = loadAndScale(res, R.drawable.provo_city_center_temple, w);
        sapporo_japan_temple = loadAndScale(res, R.drawable.sapporo_japan_temple, w);
        philadelphia_pennsylvania_temple = loadAndScale(res, R.drawable.philadelphia_pennsylvania_temple, w);
        fort_collins_colorado_temple = loadAndScale(res, R.drawable.fort_collins_colorado_temple, w);
        star_valley_wyoming_temple = loadAndScale(res, R.drawable.star_valley_wyoming_temple, w);
        hartford_connecticut_temple = loadAndScale(res, R.drawable.hartford_connecticut_temple, w);
        paris_france_temple = loadAndScale(res, R.drawable.paris_france_temple, w);
        tucson_arizona_temple = loadAndScale(res, R.drawable.tucson_arizona_temple, w);
        meridian_idaho_temple = loadAndScale(res, R.drawable.meridian_idaho_temple, w);
        cedar_city_utah_temple = loadAndScale(res, R.drawable.cedar_city_utah_temple, w);
        concepcion_chile_temple = loadAndScale(res, R.drawable.concepcion_chile_temple, w);
        barranquilla_columbia_temple = loadAndScale(res, R.drawable.barranquilla_columbia_temple, w);
        rome_italy_temple = loadAndScale(res, R.drawable.rome_italy_temple, w);
        kinshasa_temple = loadAndScale(res, R.drawable.kinshasa_temple, w);
        fortaleza_brazil_temple = loadAndScale(res, R.drawable.fortaleza_brazil_temple, w);
        haiti_temple_exterior = loadAndScale(res, R.drawable.haiti_temple_exterior, w);
        lisbon_portugal_temple = loadAndScale(res, R.drawable.lisbon_portugal_temple, w);
        arequipa_peru_temple = loadAndScale(res, R.drawable.arequipa_peru_temple, w);
        durban_south_africa_temple = loadAndScale(res, R.drawable.durban_south_africa_temple, w);

        abidjan_ivory_coast_temple = loadAndScale(res, R.drawable.abidjan_ivory_coast_temple, w);
        bangkok_thailand_temple = loadAndScale(res, R.drawable.bangkok_thailand_temple, w);
        belem_brazil_temple = loadAndScale(res, R.drawable.belem_brazil_temple, w);
        lima_peru_los_olivos_temple = loadAndScale(res, R.drawable.lima_peru_los_olivos_temple, w);
        pocatello_idaho_temple = loadAndScale(res, R.drawable.pocatello_idaho_temple, w);
        praia_cape_verde_temple = loadAndScale(res, R.drawable.praia_cape_verde_temple, w);
        puebla_mexico_temple = loadAndScale(res, R.drawable.puebla_mexico_temple, w);
        quito_ecuador_temple = loadAndScale(res, R.drawable.quito_ecuador_temple, w);
        richmond_virginia_temple = loadAndScale(res, R.drawable.richmond_virginia_temple, w);
        rio_de_janeiro_brazil_temple = loadAndScale(res, R.drawable.rio_de_janeiro_brazil_temple, w);
        san_juan_puerto_rico_temple = loadAndScale(res, R.drawable.san_juan_puerto_rico_temple, w);
        saratoga_springs_utah_temple = loadAndScale(res, R.drawable.saratoga_springs_utah_temple, w);
        urdaneta_philippines_temple = loadAndScale(res, R.drawable.urdaneta_philippines_temple, w);
        winnipeg_manitoba_temple = loadAndScale(res, R.drawable.winnipeg_manitoba_temple, w);
        yigo_guam_temple = loadAndScale(res, R.drawable.yigo_guam_temple, w);
        alabang_philippines_temple = loadAndScale(res, R.drawable.alabang_philippines_temple, w);
        antofagasta_chile_temple = loadAndScale(res, R.drawable.antofagasta_chile_temple, w);
        auckland_new_zealand_temple = loadAndScale(res, R.drawable.auckland_new_zealand_temple, w);
        bacolod_philippines_temple = loadAndScale(res, R.drawable.bacolod_philippines_temple, w);
        bahia_blanca_argentina_temple = loadAndScale(res, R.drawable.bahia_blanca_argentina_temple, w);
        bengaluru_india_temple = loadAndScale(res, R.drawable.bengaluru_india_temple, w);
        benin_city_nigeria_temple = loadAndScale(res, R.drawable.benin_city_nigeria_temple, w);
        bentonville_arkansas_temple = loadAndScale(res, R.drawable.bentonville_arkansas_temple, w);
        brasilia_brazil_temple = loadAndScale(res, R.drawable.brasilia_brazil_temple, w);
        budapest_hungary_temple = loadAndScale(res, R.drawable.budapest_hungary_temple, w);
        cagayan_de_oro_philippines_temple = loadAndScale(res, R.drawable.cagayan_de_oro_philippines_temple, w);
        coban_guatemala_temple = loadAndScale(res, R.drawable.coban_guatemala_temple, w);
        davao_philippines_temple = loadAndScale(res, R.drawable.davao_philippines_temple, w);
        dubai_united_arab_emirates_temple = loadAndScale(res, R.drawable.dubai_united_arab_emirates_temple, w);
        feather_river_california_temple = loadAndScale(res, R.drawable.feather_river_california_temple, w);
        freetown_sierra_leone_temple = loadAndScale(res, R.drawable.freetown_sierra_leone_temple, w);
        harare_zimbabwe_temple = loadAndScale(res, R.drawable.harare_zimbabwe_temple, w);
        lagos_nigeria_temple = loadAndScale(res, R.drawable.lagos_nigeria_temple, w);
        layton_utah_temple = loadAndScale(res, R.drawable.layton_utah_temple, w);
        lubumbashi_democratic_republic_of_the_congo_temple = loadAndScale(res, R.drawable.lubumbashi_democratic_republic_of_the_congo_temple, w);
        managua_nicaragua_temple = loadAndScale(res, R.drawable.managua_nicaragua_temple, w);
        mcallen_texas_temple = loadAndScale(res, R.drawable.mcallen_texas_temple, w);
        mendoza_argentina_temple = loadAndScale(res, R.drawable.mendoza_argentina_temple, w);
        moses_lake_washington_temple = loadAndScale(res, R.drawable.moses_lake_washington_temple, w);
        nairobi_kenya_temple = loadAndScale(res, R.drawable.nairobi_kenya_temple, w);
        neiafu_tonga_temple = loadAndScale(res, R.drawable.neiafu_tonga_temple, w);
        okinawa_city_okinawa_temple = loadAndScale(res, R.drawable.okinawa_city_okinawa_temple, w);
        orem_utah_temple = loadAndScale(res, R.drawable.orem_utah_temple, w);
        pago_pago_american_samoa_temple = loadAndScale(res, R.drawable.pago_pago_american_samoa_temple, w);
        phnom_penh_cambodia_temple = loadAndScale(res, R.drawable.phnom_penh_cambodia_temple, w);
        pittsburgh_pennsylvania_temple = loadAndScale(res, R.drawable.pittsburgh_pennsylvania_temple, w);
        port_moresby_papua_new_guinea_temple = loadAndScale(res, R.drawable.port_moresby_papua_new_guinea_temple, w);
        russia_temple = loadAndScale(res, R.drawable.russia_temple, w);
        salta_argentina_temple = loadAndScale(res, R.drawable.salta_argentina_temple, w);
        salvador_brazil_temple = loadAndScale(res, R.drawable.salvador_brazil_temple, w);
        san_pedro_sula_honduras_temple = loadAndScale(res, R.drawable.san_pedro_sula_honduras_temple, w);
        syracuse_utah_temple = loadAndScale(res, R.drawable.syracuse_utah_temple, w);
        tallahassee_florida_temple = loadAndScale(res, R.drawable.tallahassee_florida_temple, w);
        taylorsville_utah_temple = loadAndScale(res, R.drawable.taylorsville_utah_temple, w);
        tooele_valley_utah_temple = loadAndScale(res, R.drawable.tooele_valley_utah_temple, w);
        washington_county_utah_temple = loadAndScale(res, R.drawable.washington_county_utah_temple, w);

        shanghai_china_temple = loadAndScale(res,R.drawable.shanghai_china_temple,w);
    }

    private static Bitmap loadAndScale(Resources res, int id, float newWidth) {
        Bitmap original = BitmapFactory.decodeResource(res, id);
        float aspectRatio = (float)original.getHeight()/(float)original.getWidth();
        float newHeight = newWidth * aspectRatio;
        return Bitmap.createScaledBitmap(original, (int)newWidth, (int)newHeight, true);
    }

    public static ArrayList<Bitmap> getTemplesList() {
        templesList = new ArrayList<>();

        templesList.add(kirtland_temple);
        templesList.add(old_nauvoo_temple);
        templesList.add(st_george_temple);
        templesList.add(logan_temple);
        templesList.add(manti_temple);
        templesList.add(salt_lake_temple);
        templesList.add(laie_hawaii_temple);
        templesList.add(cardston_alberta_temple);
        templesList.add(mesa_temple);
        templesList.add(idaho_falls_temple);
        templesList.add(bern_switzerland_temple);
        templesList.add(los_angeles_temple);
        templesList.add(hamilton_new_zealand_temple);
        templesList.add(london_england_temple);
        templesList.add(oakland_temple);
        templesList.add(ogden_utah_temple);
        templesList.add(provo_temple);
        templesList.add(washington_dc_temple);
        templesList.add(sao_paulo_brazil_temple);
        templesList.add(tokyo_japan_temple);
        templesList.add(seattle_temple);
        templesList.add(jordan_river_temple);
        templesList.add(atlanta_temple);
        templesList.add(apia_samoa_temple);
        templesList.add(nukualofa_tonga_temple);
        templesList.add(santiago_chile_temple);
        templesList.add(papeete_tahiti_temple);
        templesList.add(mexico_city_temple);
        templesList.add(boise_idaho_temple);
        templesList.add(sydney_australia_temple);
        templesList.add(manila_philippines_temple);
        templesList.add(dallas_texas_temple);
        templesList.add(taipei_taiwan_temple);
        templesList.add(guatemala_lds_temple);
        templesList.add(freiberg_germany_temple);
        templesList.add(stockholm_sweden_lds_temple);
        templesList.add(chicago_temple);
        templesList.add(johannesburg_south_africa_temple);
        templesList.add(seoul_korea_temple);
        templesList.add(lima_peru_temple);
        templesList.add(buenos_aires_argentina_temple);
        templesList.add(denver_colorado_templ);
        templesList.add(frankfurt_germany_temple);
        templesList.add(portland_oregon_temple);
        templesList.add(las_vegas_temple);
        templesList.add(toronto_temple);
        templesList.add(san_diego_california_temple);
        templesList.add(orlando_temple);
        templesList.add(bountiful_temple);
        templesList.add(hong_kong_china_temple);
        templesList.add(mount_timpanogos_utah_temple);
        templesList.add(st_louis_temple);
        templesList.add(vernal_temple);
        templesList.add(preston_england_temple);
        templesList.add(monticello_utah_temple);
        templesList.add(anchorage_alaska_temple);
        templesList.add(colonia_juarez_mexico_temple);
        templesList.add(madrid_spain_temple);
        templesList.add(bogota_colombia_temple);
        templesList.add(guayaquil_ecuador_temple);
        templesList.add(spokane_washington_temple);
        templesList.add(columbus_ohio_temple);
        templesList.add(bismark_north_dakota_temple);
        templesList.add(columbia_temple);
        templesList.add(detroit_temple);
        templesList.add(halifax_nova_scotia_lds_temple);
        templesList.add(regina_temple);
        templesList.add(billings_montana_temple);
        templesList.add(edmonton_alberta_temple);
        templesList.add(raleigh_north_carolina_temple);
        templesList.add(st_paul_temple);
        templesList.add(kona_temple);
        templesList.add(ciudad_juarez_mexico_temple);
        templesList.add(hermosillo_sonora_mexico_temple);
        templesList.add(albuquerque_temple);
        templesList.add(oaxaca_mexico_temple);
        templesList.add(tuxtla_guitierrez_mexico_temple);
        templesList.add(louisville_temple);
        templesList.add(palmyra_temple);
        templesList.add(fresno_temple);
        templesList.add(medford_temple);
        templesList.add(memphis_tennessee_temple);
        templesList.add(reno_nevada_lds_temple);
        templesList.add(cochabamba_bolivia_temple);
        templesList.add(tampico_mexico_temple);
        templesList.add(nashville_temple);
        templesList.add(villahermosa_mexico_temple);
        templesList.add(montreal_quebec_temple);
        templesList.add(san_jose_costa_rica_temple);
        templesList.add(fukuoka_japan_temple);
        templesList.add(adelaide_australia_temple);
        templesList.add(melbourne_australia_temple);
        templesList.add(suva_fiji_temple);
        templesList.add(merida_mexico_temple);
        templesList.add(veracruz_mexico_temple);
        templesList.add(baton_rouge_louisiana_temple);
        templesList.add(oklahoma_city_temple);
        templesList.add(caracas_venezuela_temple);
        templesList.add(houston_texas_temple);
        templesList.add(birmingham_alabama_temple);
        templesList.add(santo_domingo_dominican_republic_temple);
        templesList.add(boston_temple);
        templesList.add(recife_brazil_temple);
        templesList.add(porto_alegre_brazil_temple);
        templesList.add(montevideo_uruguay_temple);
        templesList.add(winter_quarters_temple);
        templesList.add(guadalajara_temple);
        templesList.add(perth_australia_temple);
        templesList.add(columbia_river_temple);
        templesList.add(snowflake_temple);
        templesList.add(lubbock_temple);
        templesList.add(monterrey_mexico_temple);
        templesList.add(campinas_brazil_temple);
        templesList.add(asuncion_paraguay_temple);
        templesList.add(nauvoo_temple);
        templesList.add(the_hague_netherlands_temple);
        templesList.add(brisbane_australia_temple);
        templesList.add(redlands_temple);
        templesList.add(accra_ghana_temple);
        templesList.add(copenhagen_denmark_temple);
        templesList.add(manhattan_temple);
        templesList.add(san_antonio_temple);
        templesList.add(aba_nigeria_temple);
        templesList.add(newport_beach_california_temple);
        templesList.add(sacramento_temple);
        templesList.add(helsinki_finland_temple);
        templesList.add(rexburg_idaho_temple);
        templesList.add(curitiba_brazil_temple);
        templesList.add(panama_city_temple);
        templesList.add(twin_falls_temple);
        templesList.add(draper_utah_temple);
        templesList.add(oquirrh_mountain_utah_temple);
        templesList.add(vancouver_temple);
        templesList.add(gila_valley_temple);
        templesList.add(cebu_philippines_temple);
        templesList.add(kyiv_ukraine_temple);
        templesList.add(san_salvador_el_salvador_temple);
        templesList.add(quetzaltenango_guatemala_temple);
        templesList.add(kansas_city_temple);
        templesList.add(manaus_brazil_temple);
        templesList.add(brigham_city_utah_temple);
        templesList.add(calgary_alberta_lds_temple);
        templesList.add(tegucigalpa_honduras_temple);
        templesList.add(gilbert_arizona_temple);
        templesList.add(fort_lauderdale_florida_temple);
        templesList.add(phoenix_arizona_temple);
        templesList.add(cordoba_argentina_temple);
        templesList.add(payson_utah_temple);
        templesList.add(trujillo_peru_temple);
        templesList.add(indianapolis_indiana_temple);
        templesList.add(tijuana_mexico_temple);
        templesList.add(provo_city_center_temple);
        templesList.add(sapporo_japan_temple);
        templesList.add(philadelphia_pennsylvania_temple);
        templesList.add(fort_collins_colorado_temple);
        templesList.add(star_valley_wyoming_temple);
        templesList.add(hartford_connecticut_temple);
        templesList.add(paris_france_temple);
        templesList.add(tucson_arizona_temple);
        templesList.add(meridian_idaho_temple);
        templesList.add(cedar_city_utah_temple);
        templesList.add(concepcion_chile_temple);
        templesList.add(barranquilla_columbia_temple);
        templesList.add(rome_italy_temple);
        templesList.add(kinshasa_temple);
        templesList.add(fortaleza_brazil_temple);
        templesList.add(haiti_temple_exterior);
        templesList.add(lisbon_portugal_temple);
        templesList.add(arequipa_peru_temple);
        templesList.add(durban_south_africa_temple);

        //temples under construction

        templesList.add(winnipeg_manitoba_temple);
        templesList.add(rio_de_janeiro_brazil_temple);
        templesList.add(abidjan_ivory_coast_temple);
        templesList.add(urdaneta_philippines_temple);
        templesList.add(bangkok_thailand_temple);
        templesList.add(pocatello_idaho_temple);
        templesList.add(yigo_guam_temple);
        templesList.add(praia_cape_verde_temple);
        templesList.add(san_juan_puerto_rico_temple);
        templesList.add(quito_ecuador_temple);
        templesList.add(lima_peru_los_olivos_temple);
        templesList.add(belem_brazil_temple);
        templesList.add(saratoga_springs_utah_temple);
        templesList.add(puebla_mexico_temple);
        templesList.add(richmond_virginia_temple);
        templesList.add(layton_utah_temple);

        //announced temples

        templesList.add(harare_zimbabwe_temple);
        templesList.add(alabang_philippines_temple);
        templesList.add(brasilia_brazil_temple);
        templesList.add(nairobi_kenya_temple);
        templesList.add(bengaluru_india_temple);
        templesList.add(salta_argentina_temple);
        templesList.add(managua_nicaragua_temple);
        templesList.add(cagayan_de_oro_philippines_temple);
        templesList.add(russia_temple);
        templesList.add(auckland_new_zealand_temple);
        templesList.add(feather_river_california_temple);
        templesList.add(washington_county_utah_temple);
        templesList.add(phnom_penh_cambodia_temple);
        templesList.add(mendoza_argentina_temple);
        templesList.add(salvador_brazil_temple);
        templesList.add(lagos_nigeria_temple);
        templesList.add(davao_philippines_temple);
        templesList.add(tooele_valley_utah_temple);
        templesList.add(moses_lake_washington_temple);
        templesList.add(pago_pago_american_samoa_temple);
        templesList.add(okinawa_city_okinawa_temple);
        templesList.add(neiafu_tonga_temple);
        templesList.add(san_pedro_sula_honduras_temple);
        templesList.add(antofagasta_chile_temple);
        templesList.add(budapest_hungary_temple);
        templesList.add(orem_utah_temple);
        templesList.add(mcallen_texas_temple);
        templesList.add(taylorsville_utah_temple);
        templesList.add(freetown_sierra_leone_temple);
        templesList.add(port_moresby_papua_new_guinea_temple);
        templesList.add(bentonville_arkansas_temple);
        templesList.add(bacolod_philippines_temple);
        templesList.add(coban_guatemala_temple);
        templesList.add(bahia_blanca_argentina_temple);
        templesList.add(tallahassee_florida_temple);
        templesList.add(lubumbashi_democratic_republic_of_the_congo_temple);
        templesList.add(pittsburgh_pennsylvania_temple);
        templesList.add(benin_city_nigeria_temple);
        templesList.add(syracuse_utah_temple);
        templesList.add(dubai_united_arab_emirates_temple);

        //not include shanghai temple, according to list of temples page on official church website
        //templesList.add(shanghai_china_temple);

        return templesList;
    }

    public static Bitmap getLogo() {
        return logo_circle;
    }

    public static ArrayList<Integer> getAllImageIds() {

        allImageIds = new ArrayList<>();

        allImageIds.add(R.drawable.kirtland_temple_large);
        allImageIds.add(R.drawable.old_nauvoo_temple_large);
        allImageIds.add(R.drawable.st_george_temple_large);
        allImageIds.add(R.drawable.logan_temple_large);
        allImageIds.add(R.drawable.manti_temple_large);
        allImageIds.add(R.drawable.salt_lake_temple_large);
        allImageIds.add(R.drawable.laie_hawaii_temple_large);
        allImageIds.add(R.drawable.cardston_alberta_temple_large);
        allImageIds.add(R.drawable.mesa_temple_large);
        allImageIds.add(R.drawable.idaho_falls_temple_large);
        allImageIds.add(R.drawable.bern_switzerland_temple_large);
        allImageIds.add(R.drawable.los_angeles_temple_large);
        allImageIds.add(R.drawable.hamilton_new_zealand_temple_large);
        allImageIds.add(R.drawable.london_england_temple_large);
        allImageIds.add(R.drawable.oakland_temple_large);
        allImageIds.add(R.drawable.ogden_utah_temple_large);
        allImageIds.add(R.drawable.provo_temple_large);
        allImageIds.add(R.drawable.washington_dc_temple_large);
        allImageIds.add(R.drawable.sao_paulo_brazil_temple_large);
        allImageIds.add(R.drawable.tokyo_japan_temple_large);
        allImageIds.add(R.drawable.seattle_temple_large);
        allImageIds.add(R.drawable.jordan_river_temple_large);
        allImageIds.add(R.drawable.atlanta_temple_large);
        allImageIds.add(R.drawable.apia_samoa_temple_large);
        allImageIds.add(R.drawable.nukualofa_tonga_temple_large);
        allImageIds.add(R.drawable.santiago_chile_temple_large);
        allImageIds.add(R.drawable.papeete_tahiti_temple_large);
        allImageIds.add(R.drawable.mexico_city_temple_large);
        allImageIds.add(R.drawable.boise_idaho_temple_large);
        allImageIds.add(R.drawable.sydney_australia_temple_large);
        allImageIds.add(R.drawable.manila_philippines_temple_large);
        allImageIds.add(R.drawable.dallas_texas_temple_large);
        allImageIds.add(R.drawable.taipei_taiwan_temple_large);
        allImageIds.add(R.drawable.guatemala_lds_temple_large);
        allImageIds.add(R.drawable.freiberg_germany_temple_large);
        allImageIds.add(R.drawable.stockholm_sweden_lds_temple_large);
        allImageIds.add(R.drawable.chicago_temple_large);
        allImageIds.add(R.drawable.johannesburg_south_africa_temple_large);
        allImageIds.add(R.drawable.seoul_korea_temple_large);
        allImageIds.add(R.drawable.lima_peru_temple_large);
        allImageIds.add(R.drawable.buenos_aires_argentina_temple_large);
        allImageIds.add(R.drawable.denver_colorado_templ_large);
        allImageIds.add(R.drawable.frankfurt_germany_temple_large);
        allImageIds.add(R.drawable.portland_oregon_temple_large);
        allImageIds.add(R.drawable.las_vegas_temple_large);
        allImageIds.add(R.drawable.toronto_temple_large);
        allImageIds.add(R.drawable.san_diego_california_temple_large);
        allImageIds.add(R.drawable.orlando_temple_large);
        allImageIds.add(R.drawable.bountiful_temple_large);
        allImageIds.add(R.drawable.hong_kong_china_temple_large);
        allImageIds.add(R.drawable.mount_timpanogos_utah_temple_large);
        allImageIds.add(R.drawable.st_louis_temple_large);
        allImageIds.add(R.drawable.vernal_temple_large);
        allImageIds.add(R.drawable.preston_england_temple_large);
        allImageIds.add(R.drawable.monticello_utah_temple_large);
        allImageIds.add(R.drawable.anchorage_alaska_temple_large);
        allImageIds.add(R.drawable.colonia_juarez_mexico_temple_large);
        allImageIds.add(R.drawable.madrid_spain_temple_large);
        allImageIds.add(R.drawable.bogota_colombia_temple_large);
        allImageIds.add(R.drawable.guayaquil_ecuador_temple_large);
        allImageIds.add(R.drawable.spokane_washington_temple_large);
        allImageIds.add(R.drawable.columbus_ohio_temple_large);
        allImageIds.add(R.drawable.bismark_north_dakota_temple_large);
        allImageIds.add(R.drawable.columbia_temple_large);
        allImageIds.add(R.drawable.detroit_temple_large);
        allImageIds.add(R.drawable.halifax_nova_scotia_lds_temple_large);
        allImageIds.add(R.drawable.regina_temple_large);
        allImageIds.add(R.drawable.billings_montana_temple_large);
        allImageIds.add(R.drawable.edmonton_alberta_temple_large);
        allImageIds.add(R.drawable.raleigh_north_carolina_temple_large);
        allImageIds.add(R.drawable.st_paul_temple_large);
        allImageIds.add(R.drawable.kona_temple_large);
        allImageIds.add(R.drawable.ciudad_juarez_mexico_temple_large);
        allImageIds.add(R.drawable.hermosillo_sonora_mexico_temple_large);
        allImageIds.add(R.drawable.albuquerque_temple_large);
        allImageIds.add(R.drawable.oaxaca_mexico_temple_large);
        allImageIds.add(R.drawable.tuxtla_guitierrez_mexico_temple_large);
        allImageIds.add(R.drawable.louisville_temple_large);
        allImageIds.add(R.drawable.palmyra_temple_large);
        allImageIds.add(R.drawable.fresno_temple_large);
        allImageIds.add(R.drawable.medford_temple_large);
        allImageIds.add(R.drawable.memphis_tennessee_temple_large);
        allImageIds.add(R.drawable.reno_nevada_lds_temple_large);
        allImageIds.add(R.drawable.cochabamba_bolivia_temple_large);
        allImageIds.add(R.drawable.tampico_mexico_temple_large);
        allImageIds.add(R.drawable.nashville_temple_large);
        allImageIds.add(R.drawable.villahermosa_mexico_temple_large);
        allImageIds.add(R.drawable.montreal_quebec_temple_large);
        allImageIds.add(R.drawable.san_jose_costa_rica_temple_large);
        allImageIds.add(R.drawable.fukuoka_japan_temple_large);
        allImageIds.add(R.drawable.adelaide_australia_temple_large);
        allImageIds.add(R.drawable.melbourne_australia_temple_large);
        allImageIds.add(R.drawable.suva_fiji_temple_large);
        allImageIds.add(R.drawable.merida_mexico_temple_large);
        allImageIds.add(R.drawable.veracruz_mexico_temple_large);
        allImageIds.add(R.drawable.baton_rouge_louisiana_temple_large);
        allImageIds.add(R.drawable.oklahoma_city_temple_large);
        allImageIds.add(R.drawable.caracas_venezuela_temple_large);
        allImageIds.add(R.drawable.houston_texas_temple_large);
        allImageIds.add(R.drawable.birmingham_alabama_temple_large);
        allImageIds.add(R.drawable.santo_domingo_dominican_republic_temple_large);
        allImageIds.add(R.drawable.boston_temple_large);
        allImageIds.add(R.drawable.recife_brazil_temple_large);
        allImageIds.add(R.drawable.porto_alegre_brazil_temple_large);
        allImageIds.add(R.drawable.montevideo_uruguay_temple_large);
        allImageIds.add(R.drawable.winter_quarters_temple_large);
        allImageIds.add(R.drawable.guadalajara_temple_large);
        allImageIds.add(R.drawable.perth_australia_temple_large);
        allImageIds.add(R.drawable.columbia_river_temple_large);
        allImageIds.add(R.drawable.snowflake_temple_large);
        allImageIds.add(R.drawable.lubbock_temple_large);
        allImageIds.add(R.drawable.monterrey_mexico_temple_large);
        allImageIds.add(R.drawable.campinas_brazil_temple_large);
        allImageIds.add(R.drawable.asuncion_paraguay_temple_large);
        allImageIds.add(R.drawable.nauvoo_temple_large);
        allImageIds.add(R.drawable.the_hague_netherlands_temple_large);
        allImageIds.add(R.drawable.brisbane_australia_temple_large);
        allImageIds.add(R.drawable.redlands_temple_large);
        allImageIds.add(R.drawable.accra_ghana_temple_large);
        allImageIds.add(R.drawable.copenhagen_denmark_temple_large);
        allImageIds.add(R.drawable.manhattan_temple_large);
        allImageIds.add(R.drawable.san_antonio_temple_large);
        allImageIds.add(R.drawable.aba_nigeria_temple_large);
        allImageIds.add(R.drawable.newport_beach_california_temple_large);
        allImageIds.add(R.drawable.sacramento_temple_large);
        allImageIds.add(R.drawable.helsinki_finland_temple_large);
        allImageIds.add(R.drawable.rexburg_idaho_temple_large);
        allImageIds.add(R.drawable.curitiba_brazil_temple_large);
        allImageIds.add(R.drawable.panama_city_temple_large);
        allImageIds.add(R.drawable.twin_falls_temple_large);
        allImageIds.add(R.drawable.draper_utah_temple_large);
        allImageIds.add(R.drawable.oquirrh_mountain_utah_temple_large);
        allImageIds.add(R.drawable.vancouver_temple_large);
        allImageIds.add(R.drawable.gila_valley_temple_large);
        allImageIds.add(R.drawable.cebu_philippines_temple_large);
        allImageIds.add(R.drawable.kyiv_ukraine_temple_large);
        allImageIds.add(R.drawable.san_salvador_el_salvador_temple_large);
        allImageIds.add(R.drawable.quetzaltenango_guatemala_temple_large);
        allImageIds.add(R.drawable.kansas_city_temple_large);
        allImageIds.add(R.drawable.manaus_brazil_temple_large);
        allImageIds.add(R.drawable.brigham_city_utah_temple_large);
        allImageIds.add(R.drawable.calgary_alberta_lds_temple_large);
        allImageIds.add(R.drawable.tegucigalpa_honduras_temple_large);
        allImageIds.add(R.drawable.gilbert_arizona_temple_large);
        allImageIds.add(R.drawable.fort_lauderdale_florida_temple_large);
        allImageIds.add(R.drawable.phoenix_arizona_temple_large);
        allImageIds.add(R.drawable.cordoba_argentina_temple_large);
        allImageIds.add(R.drawable.payson_utah_temple_large);
        allImageIds.add(R.drawable.trujillo_peru_temple_large);
        allImageIds.add(R.drawable.indianapolis_indiana_temple_large);
        allImageIds.add(R.drawable.tijuana_mexico_temple_large);
        allImageIds.add(R.drawable.provo_city_center_temple_large);
        allImageIds.add(R.drawable.sapporo_japan_temple_large);
        allImageIds.add(R.drawable.philadelphia_pennsylvania_temple_large);
        allImageIds.add(R.drawable.fort_collins_colorado_temple_large);
        allImageIds.add(R.drawable.star_valley_wyoming_temple_large);
        allImageIds.add(R.drawable.hartford_connecticut_temple_large);
        allImageIds.add(R.drawable.paris_france_temple_large);
        allImageIds.add(R.drawable.tucson_arizona_temple_large);
        allImageIds.add(R.drawable.meridian_idaho_temple_large);
        allImageIds.add(R.drawable.cedar_city_utah_temple_large);
        allImageIds.add(R.drawable.concepcion_chile_temple_large);
        allImageIds.add(R.drawable.barranquilla_columbia_temple_large);
        allImageIds.add(R.drawable.rome_italy_temple_large);
        allImageIds.add(R.drawable.kinshasa_temple_large);
        allImageIds.add(R.drawable.fortaleza_brazil_temple_large);
        allImageIds.add(R.drawable.haiti_temple_exterior_large);
        allImageIds.add(R.drawable.lisbon_portugal_temple_large);
        allImageIds.add(R.drawable.arequipa_peru_temple_large);
        allImageIds.add(R.drawable.durban_south_africa_temple_large);

        //temples under construction

        allImageIds.add(R.drawable.winnipeg_manitoba_temple_large);
        allImageIds.add(R.drawable.rio_de_janeiro_brazil_temple_large);
        allImageIds.add(R.drawable.abidjan_ivory_coast_temple_large);
        allImageIds.add(R.drawable.urdaneta_philippines_temple_large);
        allImageIds.add(R.drawable.bangkok_thailand_temple_large);
        allImageIds.add(R.drawable.pocatello_idaho_temple_large);
        allImageIds.add(R.drawable.yigo_guam_temple_large);
        allImageIds.add(R.drawable.praia_cape_verde_temple_large);
        allImageIds.add(R.drawable.san_juan_puerto_rico_temple_large);
        allImageIds.add(R.drawable.quito_ecuador_temple_large);
        allImageIds.add(R.drawable.lima_peru_los_olivos_temple_large);
        allImageIds.add(R.drawable.belem_brazil_temple_large);
        allImageIds.add(R.drawable.saratoga_springs_utah_temple_large);
        allImageIds.add(R.drawable.puebla_mexico_temple_large);
        allImageIds.add(R.drawable.richmond_virginia_temple_large);
        allImageIds.add(R.drawable.layton_utah_temple_large);

        //announced temples

        allImageIds.add(R.drawable.harare_zimbabwe_temple_large);
        allImageIds.add(R.drawable.alabang_philippines_temple_large);
        allImageIds.add(R.drawable.brasilia_brazil_temple_large);
        allImageIds.add(R.drawable.nairobi_kenya_temple_large);
        allImageIds.add(R.drawable.bengaluru_india_temple_large);
        allImageIds.add(R.drawable.salta_argentina_temple_large);
        allImageIds.add(R.drawable.managua_nicaragua_temple_large);
        allImageIds.add(R.drawable.cagayan_de_oro_philippines_temple_large);
        allImageIds.add(R.drawable.russia_temple_large);
        allImageIds.add(R.drawable.auckland_new_zealand_temple_large);
        allImageIds.add(R.drawable.feather_river_california_temple_large);
        allImageIds.add(R.drawable.washington_county_utah_temple_large);
        allImageIds.add(R.drawable.phnom_penh_cambodia_temple_large);
        allImageIds.add(R.drawable.mendoza_argentina_temple_large);
        allImageIds.add(R.drawable.salvador_brazil_temple_large);
        allImageIds.add(R.drawable.lagos_nigeria_temple_large);
        allImageIds.add(R.drawable.davao_philippines_temple_large);
        allImageIds.add(R.drawable.tooele_valley_utah_temple_large);
        allImageIds.add(R.drawable.moses_lake_washington_temple_large);
        allImageIds.add(R.drawable.pago_pago_american_samoa_temple_large);
        allImageIds.add(R.drawable.okinawa_city_okinawa_temple_large);
        allImageIds.add(R.drawable.neiafu_tonga_temple_large);
        allImageIds.add(R.drawable.san_pedro_sula_honduras_temple_large);
        allImageIds.add(R.drawable.antofagasta_chile_temple_large);
        allImageIds.add(R.drawable.budapest_hungary_temple_large);
        allImageIds.add(R.drawable.orem_utah_temple_large);
        allImageIds.add(R.drawable.mcallen_texas_temple_large);
        allImageIds.add(R.drawable.taylorsville_utah_temple_large);
        allImageIds.add(R.drawable.freetown_sierra_leone_temple_large);
        allImageIds.add(R.drawable.port_moresby_papua_new_guinea_temple_large);
        allImageIds.add(R.drawable.bentonville_arkansas_temple_large);
        allImageIds.add(R.drawable.bacolod_philippines_temple_large);
        allImageIds.add(R.drawable.coban_guatemala_temple_large);
        allImageIds.add(R.drawable.bahia_blanca_argentina_temple_large);
        allImageIds.add(R.drawable.tallahassee_florida_temple_large);
        allImageIds.add(R.drawable.lubumbashi_democratic_republic_of_the_congo_temple_large);
        allImageIds.add(R.drawable.pittsburgh_pennsylvania_temple_large);
        allImageIds.add(R.drawable.benin_city_nigeria_temple_large);
        allImageIds.add(R.drawable.syracuse_utah_temple_large);
        allImageIds.add(R.drawable.dubai_united_arab_emirates_temple_large);

        allImageIds.add(R.drawable.shanghai_china_temple_large);

        return allImageIds;
    }

    public static ArrayList<Integer> getAllTempleInfoFileIds() {

        allTempleInfoFileIds = new ArrayList<>();

        allTempleInfoFileIds.add(R.raw.kirtland_temple);
        allTempleInfoFileIds.add(R.raw.old_nauvoo_temple);
        allTempleInfoFileIds.add(R.raw.st_george_temple);
        allTempleInfoFileIds.add(R.raw.logan_temple);
        allTempleInfoFileIds.add(R.raw.manti_temple);
        allTempleInfoFileIds.add(R.raw.salt_lake_temple);
        allTempleInfoFileIds.add(R.raw.laie_hawaii_temple);
        allTempleInfoFileIds.add(R.raw.cardston_alberta_temple);
        allTempleInfoFileIds.add(R.raw.mesa_temple);
        allTempleInfoFileIds.add(R.raw.idaho_falls_temple);
        allTempleInfoFileIds.add(R.raw.bern_switzerland_temple);
        allTempleInfoFileIds.add(R.raw.los_angeles_temple);
        allTempleInfoFileIds.add(R.raw.hamilton_new_zealand_temple);
        allTempleInfoFileIds.add(R.raw.london_england_temple);
        allTempleInfoFileIds.add(R.raw.oakland_temple);
        allTempleInfoFileIds.add(R.raw.ogden_utah_temple);
        allTempleInfoFileIds.add(R.raw.provo_temple);
        allTempleInfoFileIds.add(R.raw.washington_dc_temple);
        allTempleInfoFileIds.add(R.raw.sao_paulo_brazil_temple);
        allTempleInfoFileIds.add(R.raw.tokyo_japan_temple);
        allTempleInfoFileIds.add(R.raw.seattle_temple);
        allTempleInfoFileIds.add(R.raw.jordan_river_temple);
        allTempleInfoFileIds.add(R.raw.atlanta_temple);
        allTempleInfoFileIds.add(R.raw.apia_samoa_temple);
        allTempleInfoFileIds.add(R.raw.nukualofa_tonga_temple);
        allTempleInfoFileIds.add(R.raw.santiago_chile_temple);
        allTempleInfoFileIds.add(R.raw.papeete_tahiti_temple);
        allTempleInfoFileIds.add(R.raw.mexico_city_temple);
        allTempleInfoFileIds.add(R.raw.boise_idaho_temple);
        allTempleInfoFileIds.add(R.raw.sydney_australia_temple);
        allTempleInfoFileIds.add(R.raw.manila_philippines_temple);
        allTempleInfoFileIds.add(R.raw.dallas_texas_temple);
        allTempleInfoFileIds.add(R.raw.taipei_taiwan_temple);
        allTempleInfoFileIds.add(R.raw.guatemala_lds_temple);
        allTempleInfoFileIds.add(R.raw.freiberg_germany_temple);
        allTempleInfoFileIds.add(R.raw.stockholm_sweden_lds_temple);
        allTempleInfoFileIds.add(R.raw.chicago_temple);
        allTempleInfoFileIds.add(R.raw.johannesburg_south_africa_temple);
        allTempleInfoFileIds.add(R.raw.seoul_korea_temple);
        allTempleInfoFileIds.add(R.raw.lima_peru_temple);
        allTempleInfoFileIds.add(R.raw.buenos_aires_argentina_temple);
        allTempleInfoFileIds.add(R.raw.denver_colorado_templ);
        allTempleInfoFileIds.add(R.raw.frankfurt_germany_temple);
        allTempleInfoFileIds.add(R.raw.portland_oregon_temple);
        allTempleInfoFileIds.add(R.raw.las_vegas_temple);
        allTempleInfoFileIds.add(R.raw.toronto_temple);
        allTempleInfoFileIds.add(R.raw.san_diego_california_temple);
        allTempleInfoFileIds.add(R.raw.orlando_temple);
        allTempleInfoFileIds.add(R.raw.bountiful_temple);
        allTempleInfoFileIds.add(R.raw.hong_kong_china_temple);
        allTempleInfoFileIds.add(R.raw.mount_timpanogos_utah_temple);
        allTempleInfoFileIds.add(R.raw.st_louis_temple);
        allTempleInfoFileIds.add(R.raw.vernal_temple);
        allTempleInfoFileIds.add(R.raw.preston_england_temple);
        allTempleInfoFileIds.add(R.raw.monticello_utah_temple);
        allTempleInfoFileIds.add(R.raw.anchorage_alaska_temple);
        allTempleInfoFileIds.add(R.raw.colonia_juarez_mexico_temple);
        allTempleInfoFileIds.add(R.raw.madrid_spain_temple);
        allTempleInfoFileIds.add(R.raw.bogota_colombia_temple);
        allTempleInfoFileIds.add(R.raw.guayaquil_ecuador_temple);
        allTempleInfoFileIds.add(R.raw.spokane_washington_temple);
        allTempleInfoFileIds.add(R.raw.columbus_ohio_temple);
        allTempleInfoFileIds.add(R.raw.bismark_north_dakota_temple);
        allTempleInfoFileIds.add(R.raw.columbia_temple);
        allTempleInfoFileIds.add(R.raw.detroit_temple);
        allTempleInfoFileIds.add(R.raw.halifax_nova_scotia_lds_temple);
        allTempleInfoFileIds.add(R.raw.regina_temple);
        allTempleInfoFileIds.add(R.raw.billings_montana_temple);
        allTempleInfoFileIds.add(R.raw.edmonton_alberta_temple);
        allTempleInfoFileIds.add(R.raw.raleigh_north_carolina_temple);
        allTempleInfoFileIds.add(R.raw.st_paul_temple);
        allTempleInfoFileIds.add(R.raw.kona_temple);
        allTempleInfoFileIds.add(R.raw.ciudad_juarez_mexico_temple);
        allTempleInfoFileIds.add(R.raw.hermosillo_sonora_mexico_temple);
        allTempleInfoFileIds.add(R.raw.albuquerque_temple);
        allTempleInfoFileIds.add(R.raw.oaxaca_mexico_temple);
        allTempleInfoFileIds.add(R.raw.tuxtla_guitierrez_mexico_temple);
        allTempleInfoFileIds.add(R.raw.louisville_temple);
        allTempleInfoFileIds.add(R.raw.palmyra_temple);
        allTempleInfoFileIds.add(R.raw.fresno_temple);
        allTempleInfoFileIds.add(R.raw.medford_temple);
        allTempleInfoFileIds.add(R.raw.memphis_tennessee_temple);
        allTempleInfoFileIds.add(R.raw.reno_nevada_lds_temple);
        allTempleInfoFileIds.add(R.raw.cochabamba_bolivia_temple);
        allTempleInfoFileIds.add(R.raw.tampico_mexico_temple);
        allTempleInfoFileIds.add(R.raw.nashville_temple);
        allTempleInfoFileIds.add(R.raw.villahermosa_mexico_temple);
        allTempleInfoFileIds.add(R.raw.montreal_quebec_temple);
        allTempleInfoFileIds.add(R.raw.san_jose_costa_rica_temple);
        allTempleInfoFileIds.add(R.raw.fukuoka_japan_temple);
        allTempleInfoFileIds.add(R.raw.adelaide_australia_temple);
        allTempleInfoFileIds.add(R.raw.melbourne_australia_temple);
        allTempleInfoFileIds.add(R.raw.suva_fiji_temple);
        allTempleInfoFileIds.add(R.raw.merida_mexico_temple);
        allTempleInfoFileIds.add(R.raw.veracruz_mexico_temple);
        allTempleInfoFileIds.add(R.raw.baton_rouge_louisiana_temple);
        allTempleInfoFileIds.add(R.raw.oklahoma_city_temple);
        allTempleInfoFileIds.add(R.raw.caracas_venezuela_temple);
        allTempleInfoFileIds.add(R.raw.houston_texas_temple);
        allTempleInfoFileIds.add(R.raw.birmingham_alabama_temple);
        allTempleInfoFileIds.add(R.raw.santo_domingo_dominican_republic_temple);
        allTempleInfoFileIds.add(R.raw.boston_temple);
        allTempleInfoFileIds.add(R.raw.recife_brazil_temple);
        allTempleInfoFileIds.add(R.raw.porto_alegre_brazil_temple);
        allTempleInfoFileIds.add(R.raw.montevideo_uruguay_temple);
        allTempleInfoFileIds.add(R.raw.winter_quarters_temple);
        allTempleInfoFileIds.add(R.raw.guadalajara_temple);
        allTempleInfoFileIds.add(R.raw.perth_australia_temple);
        allTempleInfoFileIds.add(R.raw.columbia_river_temple);
        allTempleInfoFileIds.add(R.raw.snowflake_temple);
        allTempleInfoFileIds.add(R.raw.lubbock_temple);
        allTempleInfoFileIds.add(R.raw.monterrey_mexico_temple);
        allTempleInfoFileIds.add(R.raw.campinas_brazil_temple);
        allTempleInfoFileIds.add(R.raw.asuncion_paraguay_temple);
        allTempleInfoFileIds.add(R.raw.nauvoo_temple);
        allTempleInfoFileIds.add(R.raw.the_hague_netherlands_temple);
        allTempleInfoFileIds.add(R.raw.brisbane_australia_temple);
        allTempleInfoFileIds.add(R.raw.redlands_temple);
        allTempleInfoFileIds.add(R.raw.accra_ghana_temple);
        allTempleInfoFileIds.add(R.raw.copenhagen_denmark_temple);
        allTempleInfoFileIds.add(R.raw.manhattan_temple);
        allTempleInfoFileIds.add(R.raw.san_antonio_temple);
        allTempleInfoFileIds.add(R.raw.aba_nigeria_temple);
        allTempleInfoFileIds.add(R.raw.newport_beach_california_temple);
        allTempleInfoFileIds.add(R.raw.sacramento_temple);
        allTempleInfoFileIds.add(R.raw.helsinki_finland_temple);
        allTempleInfoFileIds.add(R.raw.rexburg_idaho_temple);
        allTempleInfoFileIds.add(R.raw.curitiba_brazil_temple);
        allTempleInfoFileIds.add(R.raw.panama_city_temple);
        allTempleInfoFileIds.add(R.raw.twin_falls_temple);
        allTempleInfoFileIds.add(R.raw.draper_utah_temple);
        allTempleInfoFileIds.add(R.raw.oquirrh_mountain_utah_temple);
        allTempleInfoFileIds.add(R.raw.vancouver_temple);
        allTempleInfoFileIds.add(R.raw.gila_valley_temple);
        allTempleInfoFileIds.add(R.raw.cebu_philippines_temple);
        allTempleInfoFileIds.add(R.raw.kyiv_ukraine_temple);
        allTempleInfoFileIds.add(R.raw.san_salvador_el_salvador_temple);
        allTempleInfoFileIds.add(R.raw.quetzaltenango_guatemala_temple);
        allTempleInfoFileIds.add(R.raw.kansas_city_temple);
        allTempleInfoFileIds.add(R.raw.manaus_brazil_temple);
        allTempleInfoFileIds.add(R.raw.brigham_city_utah_temple);
        allTempleInfoFileIds.add(R.raw.calgary_alberta_lds_temple);
        allTempleInfoFileIds.add(R.raw.tegucigalpa_honduras_temple);
        allTempleInfoFileIds.add(R.raw.gilbert_arizona_temple);
        allTempleInfoFileIds.add(R.raw.fort_lauderdale_florida_temple);
        allTempleInfoFileIds.add(R.raw.phoenix_arizona_temple);
        allTempleInfoFileIds.add(R.raw.cordoba_argentina_temple);
        allTempleInfoFileIds.add(R.raw.payson_utah_temple);
        allTempleInfoFileIds.add(R.raw.trujillo_peru_temple);
        allTempleInfoFileIds.add(R.raw.indianapolis_indiana_temple);
        allTempleInfoFileIds.add(R.raw.tijuana_mexico_temple);
        allTempleInfoFileIds.add(R.raw.provo_city_center_temple);
        allTempleInfoFileIds.add(R.raw.sapporo_japan_temple);
        allTempleInfoFileIds.add(R.raw.philadelphia_pennsylvania_temple);
        allTempleInfoFileIds.add(R.raw.fort_collins_colorado_temple);
        allTempleInfoFileIds.add(R.raw.star_valley_wyoming_temple);
        allTempleInfoFileIds.add(R.raw.hartford_connecticut_temple);
        allTempleInfoFileIds.add(R.raw.paris_france_temple);
        allTempleInfoFileIds.add(R.raw.tucson_arizona_temple);
        allTempleInfoFileIds.add(R.raw.meridian_idaho_temple);
        allTempleInfoFileIds.add(R.raw.cedar_city_utah_temple);
        allTempleInfoFileIds.add(R.raw.concepcion_chile_temple);
        allTempleInfoFileIds.add(R.raw.barranquilla_columbia_temple);
        allTempleInfoFileIds.add(R.raw.rome_italy_temple);
        allTempleInfoFileIds.add(R.raw.kinshasa_temple);
        allTempleInfoFileIds.add(R.raw.fortaleza_brazil_temple);
        allTempleInfoFileIds.add(R.raw.haiti_temple_exterior);
        allTempleInfoFileIds.add(R.raw.lisbon_portugal_temple);
        allTempleInfoFileIds.add(R.raw.arequipa_peru_temple);
        allTempleInfoFileIds.add(R.raw.durban_south_africa_temple);

        //temples under construction

        allTempleInfoFileIds.add(R.raw.winnipeg_manitoba_temple);
        allTempleInfoFileIds.add(R.raw.rio_de_janeiro_brazil_temple);
        allTempleInfoFileIds.add(R.raw.abidjan_ivory_coast_temple);
        allTempleInfoFileIds.add(R.raw.urdaneta_philippines_temple);
        allTempleInfoFileIds.add(R.raw.bangkok_thailand_temple);
        allTempleInfoFileIds.add(R.raw.pocatello_idaho_temple);
        allTempleInfoFileIds.add(R.raw.yigo_guam_temple);
        allTempleInfoFileIds.add(R.raw.praia_cape_verde_temple);
        allTempleInfoFileIds.add(R.raw.san_juan_puerto_rico_temple);
        allTempleInfoFileIds.add(R.raw.quito_ecuador_temple);
        allTempleInfoFileIds.add(R.raw.lima_peru_los_olivos_temple);
        allTempleInfoFileIds.add(R.raw.belem_brazil_temple);
        allTempleInfoFileIds.add(R.raw.saratoga_springs_utah_temple);
        allTempleInfoFileIds.add(R.raw.puebla_mexico_temple);
        allTempleInfoFileIds.add(R.raw.richmond_virginia_temple);
        allTempleInfoFileIds.add(R.raw.layton_utah_temple);

        //announced temples

        allTempleInfoFileIds.add(R.raw.harare_zimbabwe_temple);
        allTempleInfoFileIds.add(R.raw.alabang_philippines_temple);
        allTempleInfoFileIds.add(R.raw.brasilia_brazil_temple);
        allTempleInfoFileIds.add(R.raw.nairobi_kenya_temple);
        allTempleInfoFileIds.add(R.raw.bengaluru_india_temple);
        allTempleInfoFileIds.add(R.raw.salta_argentina_temple);
        allTempleInfoFileIds.add(R.raw.managua_nicaragua_temple);
        allTempleInfoFileIds.add(R.raw.cagayan_de_oro_philippines_temple);
        allTempleInfoFileIds.add(R.raw.russia_temple);
        allTempleInfoFileIds.add(R.raw.auckland_new_zealand_temple);
        allTempleInfoFileIds.add(R.raw.feather_river_california_temple);
        allTempleInfoFileIds.add(R.raw.washington_county_utah_temple);
        allTempleInfoFileIds.add(R.raw.phnom_penh_cambodia_temple);
        allTempleInfoFileIds.add(R.raw.mendoza_argentina_temple);
        allTempleInfoFileIds.add(R.raw.salvador_brazil_temple);
        allTempleInfoFileIds.add(R.raw.lagos_nigeria_temple);
        allTempleInfoFileIds.add(R.raw.davao_philippines_temple);
        allTempleInfoFileIds.add(R.raw.tooele_valley_utah_temple);
        allTempleInfoFileIds.add(R.raw.moses_lake_washington_temple);
        allTempleInfoFileIds.add(R.raw.pago_pago_american_samoa_temple);
        allTempleInfoFileIds.add(R.raw.okinawa_city_okinawa_temple);
        allTempleInfoFileIds.add(R.raw.neiafu_tonga_temple);
        allTempleInfoFileIds.add(R.raw.san_pedro_sula_honduras_temple);
        allTempleInfoFileIds.add(R.raw.antofagasta_chile_temple);
        allTempleInfoFileIds.add(R.raw.budapest_hungary_temple);
        allTempleInfoFileIds.add(R.raw.orem_utah_temple);
        allTempleInfoFileIds.add(R.raw.mcallen_texas_temple);
        allTempleInfoFileIds.add(R.raw.taylorsville_utah_temple);
        allTempleInfoFileIds.add(R.raw.freetown_sierra_leone_temple);
        allTempleInfoFileIds.add(R.raw.port_moresby_papua_new_guinea_temple);
        allTempleInfoFileIds.add(R.raw.bentonville_arkansas_temple);
        allTempleInfoFileIds.add(R.raw.bacolod_philippines_temple);
        allTempleInfoFileIds.add(R.raw.coban_guatemala_temple);
        allTempleInfoFileIds.add(R.raw.bahia_blanca_argentina_temple);
        allTempleInfoFileIds.add(R.raw.tallahassee_florida_temple);
        allTempleInfoFileIds.add(R.raw.lubumbashi_democratic_republic_of_the_congo_temple);
        allTempleInfoFileIds.add(R.raw.pittsburgh_pennsylvania_temple);
        allTempleInfoFileIds.add(R.raw.benin_city_nigeria_temple);
        allTempleInfoFileIds.add(R.raw.syracuse_utah_temple);
        allTempleInfoFileIds.add(R.raw.dubai_united_arab_emirates_temple);

        allTempleInfoFileIds.add(R.raw.shanghai_china_temple);

        return allTempleInfoFileIds;

    }

    }


