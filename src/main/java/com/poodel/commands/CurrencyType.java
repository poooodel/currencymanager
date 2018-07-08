package com.poodel.commands;

/**
 * Перечисление всех доступных аббревиатур валют на сайте fixer.io
 */
public enum CurrencyType {

            AED("AED"),
            AFN("AFN"),
            ALL("ALL"),
            AMD("AMD"),
            ANG("ANG"),
            AOA("AOA"),
            ARS("ARS"),
            AUD("AUD"),
            AWG("AWG"),
            AZN("AZN"),
            BAM("BAM"),
            BBD("BBD"),
            BDT("BDT"),
            BGN("BGN"),
            BHD("BHD"),
            BIF("BIF"),
            BMD("BMD"),
            BND("BND"),
            BOB("BOB"),
            BRL("BRL"),
            BSD("BSD"),
            BTC("BTC"),
            BTN("BTN"),
            BWP("BWP"),
            BYN("BYN"),
            BYR("BYR"),
            BZD("BZD"),
            CAD("CAD"),
            CDF("CDF"),
            CHF("CHF"),
            CLF("CLF"),
            CLP("CLP"),
            CNY("CNY"),
            COP("COP"),
            CRC("CRC"),
            CUC("CUC"),
            CUP("CUP"),
            CVE("CVE"),
            CZK("CZK"),
            DJF("DJF"),
            DKK("DKK"),
            DOP("DOP"),
            DZD("DZD"),
            EGP("EGP"),
            ERN("ERN"),
            ETB("ETB"),
            EUR("EUR"),
            FJD("FJD"),
            FKP("FKP"),
            GBP("GBP"),
            GEL("GEL"),
            GGP("GGP"),
            GHS("GHS"),
            GIP("GIP"),
            GMD("GMD"),
            GNF("GNF"),
            GTQ("GTQ"),
            GYD("GYD"),
            HKD("HKD"),
            HNL("HNL"),
            HRK("HRK"),
            HTG("HTG"),
            HUF("HUF"),
            IDR("IDR"),
            ILS("ILS"),
            IMP("IMP"),
            INR("INR"),
            IQD("IQD"),
            IRR("IRR"),
            ISK("ISK"),
            JEP("JEP"),
            JMD("JMD"),
            JOD("JOD"),
            JPY("JPY"),
            KES("KES"),
            KGS("KGS"),
            KHR("KHR"),
            KMF("KMF"),
            KPW("KPW"),
            KRW("KRW"),
            KWD("KWD"),
            KYD("KYD"),
            KZT("KZT"),
            LAK("LAK"),
            LBP("LBP"),
            LKR("LKR"),
            LRD("LRD"),
            LSL("LSL"),
            LTL("LTL"),
            LVL("LVL"),
            LYD("LYD"),
            MAD("MAD"),
            MDL("MDL"),
            MGA("MGA"),
            MKD("MKD"),
            MMK("MMK"),
            MNT("MNT"),
            MOP("MOP"),
            MRO("MRO"),
            MUR("MUR"),
            MVR("MVR"),
            MWK("MWK"),
            MXN("MXN"),
            MYR("MYR"),
            MZN("MZN"),
            NAD("NAD"),
            NGN("NGN"),
            NIO("NIO"),
            NOK("NOK"),
            NPR("NPR"),
            NZD("NZD"),
            OMR("OMR"),
            PAB("PAB"),
            PEN("PEN"),
            PGK("PGK"),
            PHP("PHP"),
            PKR("PKR"),
            PLN("PLN"),
            PYG("PYG"),
            QAR("QAR"),
            RON("RON"),
            RSD("RSD"),
            RUB("RUB"),
            RWF("RWF"),
            SAR("SAR"),
            SBD("SBD"),
            SCR("SCR"),
            SDG("SDG"),
            SEK("SEK"),
            SGD("SGD"),
            SHP("SHP"),
            SLL("SLL"),
            SOS("SOS"),
            SRD("SRD"),
            STD("STD"),
            SVC("SVC"),
            SYP("SYP"),
            SZL("SZL"),
            THB("THB"),
            TJS("TJS"),
            TMT("TMT"),
            TND("TND"),
            TOP("TOP"),
            TRY("TRY"),
            TTD("TTD"),
            TWD("TWD"),
            TZS("TZS"),
            UAH("UAH"),
            UGX("UGX"),
            USD("USD"),
            UYU("UYU"),
            UZS("UZS"),
            VEF("VEF"),
            VND("VND"),
            VUV("VUV"),
            WST("WST"),
            XAF("XAF"),
            XAG("XAG"),
            XAU("XAU"),
            XCD("XCD"),
            XDR("XDR"),
            XOF("XOF"),
            XPF("XPF"),
            YER("YER"),
            ZAR("ZAR"),
            ZMK("ZMK"),
            ZMW("ZMW"),
            ZWL("ZWL");

    /**
     * Конструктор Enum-а, предоставляющий доступ на запись содержимомого
     *
     * @param abbreviation поле аббревиатуры
     */
    CurrencyType(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
     * Геттер Enum-a, предоставляющий доступ к содержимому из-вне
     *
     * @return возрат аббревиатуры
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Поле класса Аббревиатура.
     */
    private String abbreviation;
}
