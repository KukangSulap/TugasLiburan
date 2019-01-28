package com.barney.countriesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spNamen;
    String[] PoliticalUnion = {
            "European Union",
            "European Free Trade Association",
            "Caribbean Community",
            "Pacific Alliance",
            "African Union",
            "Union of South American Nations",
            "Eurasian Economic Union",
            "Arab League",
            "Association of Southeast Asian Nations",
            "Central American Integration System",
            "Central European Free Trade Agreement",
            "North American Free Trade Agreement",
            "South Asian Association for Regional Cooperation"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spNamen = findViewById(R.id.sp_name);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, PoliticalUnion);

        spNamen.setAdapter(adapter);

        spNamen.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view,final int position, long l) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("name", PoliticalUnion[position]);
                intent.putExtra("any", any[position]);
                intent.putExtra("cover", covers[position]);
                startActivity(intent);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        String [] any = {"The European Union (EU) is a political and economic union of 28 member states that are located primarily in Europe.[12] It has an area of 4,475,757 km2 (1,728,099 sq mi) and an estimated population of about 513 million. The EU has developed an internal single market through a standardised system of laws that apply in all member states in those matters, and only those matters, where members have agreed to act as one. EU policies aim to ensure the free movement of people, goods, services and capital within the internal market,[13] enact legislation in justice and home affairs and maintain common policies on trade,[14] agriculture,[15] fisheries and regional development.[16] For travel within the Schengen Area, passport controls have been abolished.[17] A monetary union was established in 1999 and came into full force in 2002 and is composed of 19 EU member states which use the euro currency.",
                "The European Free Trade Association (EFTA) is a regional trade organization and free trade area consisting of four European states: Iceland, Liechtenstein, Norway, and Switzerland.[3] The organization operates in parallel with the European Union (EU), and all four member states participate in the European Single Market and are part of the Schengen Area.[4] They are not, however, party to the European Union Customs Union.",
                "The Caribbean Community (CARICOM) is an organisation of fifteen Caribbean nations and dependencies whose main objective is to promote economic integration and cooperation among its members, to ensure that the benefits of integration are equitably shared, and to coordinate foreign policy.[4] The organisation was established in 1973. Its major activities involve coordinating economic policies and development planning; devising and instituting special projects for the less-developed countries within its jurisdiction; operating as a regional single market for many of its members (Caricom Single Market); and handling regional trade disputes. The secretariat headquarters is in Georgetown, Guyana. CARICOM is an official United Nations Observer.",
                "The Pacific Alliance (Spanish: Alianza del Pacífico) is a Latin American trade bloc, formed by Chile, Colombia, Mexico and Peru, which all border the Pacific Ocean. These countries have come together to form an area of integration with the purpose of ensure a complete freedom in the movement of goods, services, capital, and people. Together, these four countries have a combined population of 210 million people and about 35% of the region's GDP.",
                "The African Union (AU) is a continental union consisting of 55 countries of the continent of Africa, with exception of various territories of European possessions located in Africa. The bloc was founded on 26 May 2001 in Addis Ababa, Ethiopia and launched on 9 July 2002 in South Africa.[7] The intention of the AU is to replace the Organisation of African Unity (OAU), established on 25 May 1963 in Addis Ababa by 32 signatory governments. The most important decisions of the AU are made by the Assembly of the African Union, a semi-annual meeting of the heads of state and government of its member states. The AU's secretariat, the African Union Commission, is based in Addis Ababa.",
                "The Union of South American Nations (USAN; Spanish: Unión de Naciones Suramericanas, UNASUR; Portuguese: União de Nações Sul-Americanas, UNASUL; Dutch: Unie van Zuid-Amerikaanse Naties, UZAN; and sometimes referred to as the South American Union) is an intergovernmental regional organization comprising twelve South American countries.",
                "The Eurasian Economic Union (EAEU, or EEU),[note 1] sometimes known informally as the Eurasian Union (EAU), is a political and economic union of states located in central and northern Eurasia. The treaty aiming for the establishment of the EAEU was signed on 29 May 2014 by the leaders of Belarus, Kazakhstan and Russia, and came into force on 1 January 2015.[5] Treaties aiming for Armenia's and Kyrgyzstan's accession to the Eurasian Economic Union were signed on 9 October and 23 December 2014, respectively. Armenia's accession treaty came into force on 2 January 2015.[6] Kyrgyzstan's accession treaty came into effect on 6 August 2015.[7] It participated in the EAEU from the day of its establishment as an acceding state.",
                "The Arab League (Arabic: الجامعة العربية\\u200E al-Jāmiʻah al-ʻArabīyah), formally the League of Arab States (Arabic: جامعة الدول العربية\\u200E Jāmiʿat ad-Duwal al-ʿArabīyah), is a regional organization of Arab states in and around North Africa, the Horn of Africa and Arabia. It was formed in Cairo on 22 March 1945 with six members: Kingdom of Egypt, Kingdom of Iraq, Transjordan (renamed Jordan in 1949), Lebanon, Saudi Arabia, and Syria.[3] Yemen joined as a member on 5 May 1945. Currently, the League has 22 members, but Syria's participation has been suspended since November 2011, as a consequence of government repression during the Syrian Civil War.\",\n",
                "The Association of Southeast Asian Nations[11] (ASEAN /ˈɑːsiɑːn/ AH-see-ahn,[12] /ˈɑːziɑːn/ AH-zee-ahn)[13][14] is a regional intergovernmental organization comprising ten countries in Southeast Asia, which promotes intergovernmental cooperation and facilitates economic, political, security, military, educational, and sociocultural integration among its members and other countries in Asia. It also regularly engages other countries in the Asia-Pacific region and beyond. ASEAN maintains a global network of alliances and dialogue partners and is considered by some as global powerhouse,[15][16] the central union for cooperation in Asia-Pacific, and a prominent and influential organisation. It is involved in numerous international affairs, and hosts diplomatic missions throughout the world.[17][18][19][20] It is a major partner of the Shanghai Cooperation Organisation, developing cooperation model with the organisation for the peace, stability, development and sustainability of Asia.",
                "The Central American Integration System (Spanish: Sistema de la Integración Centroamericana, or SICA) has been the economic and political organization of Central American states since February 1, 1993. On December 13, 1991, the ODECA countries (Spanish: Organización de Estados Centroamericanos) signed the Protocol of Tegucigalpa, extending earlier cooperation for regional peace, political freedom, democracy and economic development. SICA's General Secretariat is in El Salvador.",
                "The Central European Free Trade Agreement (CEFTA) is a trade agreement between non-EU countries, members of which are now mostly located in Southeastern Europe. Founded by representatives of Poland, Hungary and Czechoslovakia, CEFTA expanded to Albania, Bosnia and Herzegovina, Bulgaria, Croatia, Macedonia, Moldova, Montenegro, Romania, Serbia, Slovenia and the UNMIK (on behalf of Kosovo in accordance with UNSCR 1244)",
                "The North American Free Trade Agreement (NAFTA; Spanish: Tratado de Libre Comercio de América del Norte, TLCAN; French: Accord de libre-échange nord-américain, ALÉNA) is an agreement signed by Canada, Mexico, and the United States, creating a trilateral trade bloc in North America. The agreement came into force on January 1, 1994.[4] It superseded the 1988 Canada–United States Free Trade Agreement between the United States and Canada,[5] and is expected to be replaced by the United States–Mexico–Canada Agreement once it is ratifed.",
                "The South Asian Association for Regional Cooperation (SAARC) is the regional intergovernmental organization and geopolitical union of nations in South Asia. Its member states include Afghanistan, Bangladesh, Bhutan, India, Nepal, the Maldives, Pakistan and Sri Lanka. SAARC comprises 3% of the world's area, 21% of the world's population and 3.8% (US$2.9 trillion)[3] of the global economy, as of 2015."
        };

        int[] covers = new int[]{
                R.drawable.al,
                R.drawable.asean,
                R.drawable.au,
                R.drawable.caricom,
                R.drawable.cefta,
                R.drawable.eeu,
                R.drawable.efta,
                R.drawable.eu,
                R.drawable.nafta,
                R.drawable.pa,
                R.drawable.saarc,
                R.drawable.sica,
                R.drawable.usan,
        };

        });

        }
    }

