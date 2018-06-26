/*
 * Copyright (C) 2018 Inderjeet Singh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.singhinderjeet.countries;

/**
 * ISO 639 Language code for various languages
 *
 * @author Inderjeet Singh
 */
public enum LanguageCode {
    // based on http://www.oracle.com/technetwork/java/javase/java8locales_2095355.html
    //  Language Tag  Language (ISO 639)    Country (ISO 3166)    Variant    Script  (ISO 15924)

    sq_AL("Albanian", CountryCode.AL, LanguageScript.Latn),
    ar_DZ("Arabic (DZ)", CountryCode.DZ, LanguageScript.Arab),
    ar_BH("Arabic (BH)", CountryCode.BH, LanguageScript.Arab),
    ar_EG("Arabic (EG)", CountryCode.EG, LanguageScript.Arab),
    ar_IQ("Arabic (IQ)", CountryCode.IQ, LanguageScript.Arab),
    ar_JO("Arabic (JO)", CountryCode.JO, LanguageScript.Arab),
    ar_KW("Arabic (KW)", CountryCode.KW, LanguageScript.Arab),
    ar_LB("Arabic (LB)", CountryCode.LB, LanguageScript.Arab),
    ar_LY("Arabic (LY)", CountryCode.LY, LanguageScript.Arab),
    ar_MA("Arabic (MA)", CountryCode.MA, LanguageScript.Arab),
    ar_OM("Arabic (OM)", CountryCode.OM, LanguageScript.Arab),
    ar_QA("Arabic (QA)", CountryCode.QA, LanguageScript.Arab),
    ar_SA("Arabic (SA)", CountryCode.SA, LanguageScript.Arab),
    ar_SD("Arabic (SD)", CountryCode.SD, LanguageScript.Arab),
    ar_SY("Arabic (SY)", CountryCode.SY, LanguageScript.Arab),
    ar_TN("Arabic (TN)", CountryCode.TN, LanguageScript.Arab),
    ar_AE("Arabic (AE)", CountryCode.AE, LanguageScript.Arab),
    ar_YE("Arabic (YE)", CountryCode.YE, LanguageScript.Arab),
    be_BY("Belarusian", CountryCode.BY, LanguageScript.Cyrl),
    bg_BG("Bulgarian", CountryCode.BG, LanguageScript.Cyrl),
    ca_ES("Catalan", CountryCode.ES, LanguageScript.Latn),
    zh_CN("Chinese (CN)", CountryCode.CN, LanguageScript.Hans),
    zh_SG("Chinese (SG)", CountryCode.SG, LanguageScript.Hans),
    zh_HK("Chinese (HK)", CountryCode.HK, LanguageScript.Hant),
    zh_TW("Chinese (TW)", CountryCode.TW, LanguageScript.Hant),
    hr_HR("Croatian", CountryCode.HR, LanguageScript.Latn),
    cs_CZ("Czech", CountryCode.CZ, LanguageScript.Latn),
    da_DK("Danish", CountryCode.DK, LanguageScript.Latn),
    nl_BE("Dutch (BE)", CountryCode.BE, LanguageScript.Latn),
    nl_NL("Dutch (NL)", CountryCode.NL, LanguageScript.Latn),
    en_AU("English (AU)", CountryCode.AU, LanguageScript.Latn),
    en_CA("English (CA)", CountryCode.CA, LanguageScript.Latn),
    en_IN("English (IN)", CountryCode.IN, LanguageScript.Latn),
    en_IE("English (IE)", CountryCode.IE, LanguageScript.Latn),
    en_MT("English (MT)", CountryCode.MT, LanguageScript.Latn),
    en_NZ("English (NZ)", CountryCode.NZ, LanguageScript.Latn),
    en_PH("English (PH)", CountryCode.PH, LanguageScript.Latn),
    en_SG("English (SG)", CountryCode.SG, LanguageScript.Latn),
    en_ZA("English (ZA)", CountryCode.ZA, LanguageScript.Latn),
    en_GB("English (GB)", CountryCode.GB, LanguageScript.Latn),
    en_US("English (US)", CountryCode.US, LanguageScript.Latn),
    et_EE("Estonian", CountryCode.EE, LanguageScript.Latn),
    fi_FI("Finnish", CountryCode.FI, LanguageScript.Latn),
    fr_BE("French (BE)", CountryCode.BE, LanguageScript.Latn),
    fr_CA("French (CA)", CountryCode.CA, LanguageScript.Latn),
    fr_FR("French (FR)", CountryCode.FR, LanguageScript.Latn),
    fr_LU("French (LU)", CountryCode.LU, LanguageScript.Latn),
    fr_CH("French (CH)", CountryCode.CH, LanguageScript.Latn),
    de_AT("German (AT)", CountryCode.AT, LanguageScript.Latn),
    de_DE("German (DE)", CountryCode.DE, LanguageScript.Latn),
    de_LU("German (LU)", CountryCode.LU, LanguageScript.Latn),
    de_CH("German (CH)", CountryCode.CH, LanguageScript.Latn),
    el_CY("Greek (CY)", CountryCode.CY, LanguageScript.Grek),
    el_GR("Greek (GR)", CountryCode.GR, LanguageScript.Grek),
    iw_IL("Hebrew", CountryCode.IL, LanguageScript.Hebr),
    hi_IN("Hindi", CountryCode.IN, LanguageScript.Deva),
    hu_HU("Hungarian", CountryCode.HU, LanguageScript.Latn),
    is_IS("Icelandic", CountryCode.IS, LanguageScript.Latn),
    in_ID("Indonesian", CountryCode.ID, LanguageScript.Latn),
    ga_IE("Irish", CountryCode.IE, LanguageScript.Latn),
    it_IT("Italian (IT)", CountryCode.IT, LanguageScript.Latn),
    it_CH("Italian (CH)", CountryCode.CH, LanguageScript.Latn),
    ja_JP("Japanese (JP)", CountryCode.JP, LanguageScript.Jpan),
    ja_JP_u_ca_japanese("Japanese (JP)", CountryCode.JP, LanguageScript.Jpan),
    ja_JP_x_lvariant_JP("Japanese (JP)", CountryCode.JP, LanguageScript.Jpan),
    ko_KR("Korean", CountryCode.KR, LanguageScript.Kore),
    lv_LV("Latvian", CountryCode.LV, LanguageScript.Latn),
    lt_LT("Lithuanian", CountryCode.LT, LanguageScript.Latn),
    mk_MK("Macedonian", CountryCode.MK, LanguageScript.Cyrl),
    ms_MY("Malay", CountryCode.MY, LanguageScript.Latn),
    mt_MT("Maltese", CountryCode.MT, LanguageScript.Latn),
    no_NO("Norwegian (NO)", CountryCode.NO, LanguageScript.Latn),
    nb_NO("Norwegian Bokmål", CountryCode.NO, LanguageScript.Latn),
    nn_NO("Norwegian Nynorsk", CountryCode.NO, LanguageScript.Latn),
    no_NO_x_lvariant_NY("Norwegian (NO)", CountryCode.NO, LanguageScript.Latn),  // “no” is treated as Norwegian Nynorsk. (For compatibility)
    pl_PL("Polish", CountryCode.PL, LanguageScript.Latn),
    pt_BR("Portuguese (BR)", CountryCode.BR, LanguageScript.Latn),
    pt_PT("Portuguese (PT)", CountryCode.PT, LanguageScript.Latn),
    ro_RO("Romanian", CountryCode.RO, LanguageScript.Latn),
    ru_RU("Russian", CountryCode.RU, LanguageScript.Cyrl),
    sr_BA("Serbian (BA)", CountryCode.BA, LanguageScript.Cyrl),
    sr_ME("Serbian (ME)", CountryCode.ME, LanguageScript.Cyrl),
    sr_RS("Serbian (RS)", CountryCode.RS, LanguageScript.Cyrl),
    sr_Latn_BA("Serbian (BA)", CountryCode.BA, LanguageScript.Latn),
    sr_Latn_ME("Serbian (ME)", CountryCode.ME, LanguageScript.Latn),
    sr_Latn_RS("Serbian (RS)", CountryCode.RS, LanguageScript.Latn),
    sk_SK("Slovak", CountryCode.SK, LanguageScript.Latn),
    sl_SI("Slovenian", CountryCode.SI, LanguageScript.Latn),
    es_AR("Spanish (AR)", CountryCode.AR, LanguageScript.Latn),
    es_BO("Spanish (BO)", CountryCode.BO, LanguageScript.Latn),
    es_CL("Spanish (CL)", CountryCode.CL, LanguageScript.Latn),
    es_CO("Spanish (CO)", CountryCode.CO, LanguageScript.Latn),
    es_CR("Spanish (CR)", CountryCode.CR, LanguageScript.Latn),
    es_DO("Spanish (DO)", CountryCode.DO, LanguageScript.Latn),
    es_EC("Spanish (EC)", CountryCode.EC, LanguageScript.Latn),
    es_SV("Spanish (SV)", CountryCode.SV, LanguageScript.Latn),
    es_GT("Spanish (GT)", CountryCode.GT, LanguageScript.Latn),
    es_HN("Spanish (HN)", CountryCode.HN, LanguageScript.Latn),
    es_MX("Spanish (MX)", CountryCode.MX, LanguageScript.Latn),
    es_NI("Spanish (NL)", CountryCode.NL, LanguageScript.Latn),
    es_PA("Spanish (PA)", CountryCode.PA, LanguageScript.Latn),
    es_PY("Spanish (PY)", CountryCode.PY, LanguageScript.Latn),
    es_PE("Spanish (PE)", CountryCode.PE, LanguageScript.Latn),
    es_PR("Spanish (PR)", CountryCode.PR, LanguageScript.Latn),
    es_ES("Spanish (ES)", CountryCode.ES, LanguageScript.Latn),
    es_US("Spanish (US)", CountryCode.US, LanguageScript.Latn),
    es_UY("Spanish (UY)", CountryCode.UY, LanguageScript.Latn),
    es_VE("Spanish (VE)", CountryCode.VE, LanguageScript.Latn),
    sv_SE("Swedish", CountryCode.SE, LanguageScript.Latn),
    th_TH("Thai (TH)", CountryCode.TH, LanguageScript.Thai),
    th_TH_u_ca_buddhist("Thai (TH)", CountryCode.TH, LanguageScript.Thai), // Implicitly specifies the Latin numbering system. Explicitly specifies the Script.Thai Buddhist calendar with java.util.Calendar.
    th_TH_u_ca_buddhist_nu_thai("Thai (TH)", CountryCode.TH, LanguageScript.Thai), // Explicitly specifies the Script.Thai numbering system and the Script.Thai Buddhist calendar with java.util.Calendar.
    th_TH_x_lvariant_TH("Thai (TH)", CountryCode.TH, LanguageScript.Thai), // Explicitly specifies the Thai numbering system and the Thai Buddhist calendar with java.util.Calendar. (For compatibility)
    tr_TR("Turkish", CountryCode.TR, LanguageScript.Latn),
    uk_UA("Ukrainian", CountryCode.UA, LanguageScript.Cyrl),
    vi_VN("Vietnamese", CountryCode.VN, LanguageScript.Latn);

    private final String name;
    private final CountryCode countryCode;
    private final LanguageScript script;

    LanguageCode(String name, CountryCode countryCode, LanguageScript script) {
        this.name = name;
        this.countryCode = countryCode;
        this.script = script;
    }

    public String getName() {
        return name;
    }

    public CountryCode getCountryCode() {
        return countryCode;
    }

    public LanguageScript getScript() {
        return script;
    }
}
