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

    sq_AL("Albanian (sq)", CountryCode.AL, LanguageScript.Latn),
    ar_DZ("Arabic (ar)", CountryCode.DZ, LanguageScript.Arab),
    ar_BH("Arabic (ar)", CountryCode.BH, LanguageScript.Arab),
    ar_EG("Arabic (ar)", CountryCode.EG, LanguageScript.Arab),
    ar_IQ("Arabic (ar)", CountryCode.IQ, LanguageScript.Arab),
    ar_JO("Arabic (ar)", CountryCode.JO, LanguageScript.Arab),
    ar_KW("Arabic (ar)", CountryCode.KW, LanguageScript.Arab),
    ar_LB("Arabic (ar)", CountryCode.LB, LanguageScript.Arab),
    ar_LY("Arabic (ar)", CountryCode.LY, LanguageScript.Arab),
    ar_MA("Arabic (ar)", CountryCode.MA, LanguageScript.Arab),
    ar_OM("Arabic (ar)", CountryCode.OM, LanguageScript.Arab),
    ar_QA("Arabic (ar)", CountryCode.QA, LanguageScript.Arab),
    ar_SA("Arabic (ar)", CountryCode.SA, LanguageScript.Arab),
    ar_SD("Arabic (ar)", CountryCode.SD, LanguageScript.Arab),
    ar_SY("Arabic (ar)", CountryCode.SY, LanguageScript.Arab),
    ar_TN("Arabic (ar)", CountryCode.TN, LanguageScript.Arab),
    ar_AE("Arabic (ar)", CountryCode.AE, LanguageScript.Arab),
    ar_YE("Arabic (ar)", CountryCode.YE, LanguageScript.Arab),
    be_BY("Belarusian (be)", CountryCode.BY, LanguageScript.Cyrl),
    bg_BG("Bulgarian (bg)", CountryCode.BG, LanguageScript.Cyrl),
    ca_ES("Catalan (ca)", CountryCode.ES, LanguageScript.Latn),
    zh_CN("Chinese (zh)", CountryCode.CN, LanguageScript.Hans),
    zh_SG("Chinese (zh)", CountryCode.SG, LanguageScript.Hans),
    zh_HK("Chinese (zh)", CountryCode.HK, LanguageScript.Hant),
    zh_TW("Chinese (zh)", CountryCode.TW, LanguageScript.Hant),
    hr_HR("Croatian (hr)", CountryCode.HR, LanguageScript.Latn),
    cs_CZ("Czech (cs)", CountryCode.CZ, LanguageScript.Latn),
    da_DK("Danish (da)", CountryCode.DK, LanguageScript.Latn),
    nl_BE("Dutch (nl)", CountryCode.BE, LanguageScript.Latn),
    nl_NL("Dutch (nl)", CountryCode.NL, LanguageScript.Latn),
    en_AU("English (en)", CountryCode.AU, LanguageScript.Latn),
    en_CA("English (en)", CountryCode.CA, LanguageScript.Latn),
    en_IN("English (en)", CountryCode.IN, LanguageScript.Latn),
    en_IE("English (en)", CountryCode.IE, LanguageScript.Latn),
    en_MT("English (en)", CountryCode.MT, LanguageScript.Latn),
    en_NZ("English (en)", CountryCode.NZ, LanguageScript.Latn),
    en_PH("English (en)", CountryCode.PH, LanguageScript.Latn),
    en_SG("English (en)", CountryCode.SG, LanguageScript.Latn),
    en_ZA("English (en)", CountryCode.ZA, LanguageScript.Latn),
    en_GB("English (en)", CountryCode.GB, LanguageScript.Latn),
    en_US("English (en)", CountryCode.US, LanguageScript.Latn),
    et_EE("Estonian (et)", CountryCode.EE, LanguageScript.Latn),
    fi_FI("Finnish (fi)", CountryCode.FI, LanguageScript.Latn),
    fr_BE("French (fr)", CountryCode.BE, LanguageScript.Latn),
    fr_CA("French (fr)", CountryCode.CA, LanguageScript.Latn),
    fr_FR("French (fr)", CountryCode.FR, LanguageScript.Latn),
    fr_LU("French (fr)", CountryCode.LU, LanguageScript.Latn),
    fr_CH("French (fr)", CountryCode.CH, LanguageScript.Latn),
    de_AT("German (de)", CountryCode.AT, LanguageScript.Latn),
    de_DE("German (de)", CountryCode.DE, LanguageScript.Latn),
    de_LU("German (de)", CountryCode.LU, LanguageScript.Latn),
    de_CH("German (de)", CountryCode.CH, LanguageScript.Latn),
    el_CY("Greek (el)", CountryCode.CY, LanguageScript.Grek),
    el_GR("Greek (el)", CountryCode.GR, LanguageScript.Grek),
    iw_IL("Hebrew (iw)", CountryCode.IL, LanguageScript.Hebr),
    hi_IN("Hindi (hi)", CountryCode.IN, LanguageScript.Deva),
    hu_HU("Hungarian (hu)", CountryCode.HU, LanguageScript.Latn),
    is_IS("Icelandic (is)", CountryCode.IS, LanguageScript.Latn),
    in_ID("Indonesian (in)", CountryCode.ID, LanguageScript.Latn),
    ga_IE("Irish (ga)", CountryCode.IE, LanguageScript.Latn),
    it_IT("Italian (it)", CountryCode.IT, LanguageScript.Latn),
    it_CH("Italian (it)", CountryCode.CH, LanguageScript.Latn),
    ja_JP("Japanese (ja)", CountryCode.JP, LanguageScript.Jpan),
    ja_JP_u_ca_japanese("Japanese (ja)", CountryCode.JP, LanguageScript.Jpan),
    ja_JP_x_lvariant_JP("Japanese (ja)", CountryCode.JP, LanguageScript.Jpan),
    ko_KR("Korean (ko)", CountryCode.KR, LanguageScript.Kore),
    lv_LV("Latvian (lv)", CountryCode.LV, LanguageScript.Latn),
    lt_LT("Lithuanian (lt)", CountryCode.LT, LanguageScript.Latn),
    mk_MK("Macedonian (mk)", CountryCode.MK, LanguageScript.Cyrl),
    ms_MY("Malay (ms)", CountryCode.MY, LanguageScript.Latn),
    mt_MT("Maltese (mt)", CountryCode.MT, LanguageScript.Latn),
    no_NO("Norwegian (no)", CountryCode.NO, LanguageScript.Latn),
    nb_NO("Norwegian Bokmål (nb)", CountryCode.NO, LanguageScript.Latn),
    nn_NO("Norwegian Nynorsk (nn)", CountryCode.NO, LanguageScript.Latn),
    no_NO_x_lvariant_NY("Norwegian (no)", CountryCode.NO, LanguageScript.Latn),  // “no” is treated as Norwegian Nynorsk. (For compatibility)
    pl_PL("Polish (pl)", CountryCode.PL, LanguageScript.Latn),
    pt_BR("Portuguese (pt)", CountryCode.BR, LanguageScript.Latn),
    pt_PT("Portuguese (pt)", CountryCode.PT, LanguageScript.Latn),
    ro_RO("Romanian (ro)", CountryCode.RO, LanguageScript.Latn),
    ru_RU("Russian (ru)", CountryCode.RU, LanguageScript.Cyrl),
    sr_BA("Serbian (sr)", CountryCode.BA, LanguageScript.Cyrl),
    sr_ME("Serbian (sr)", CountryCode.ME, LanguageScript.Cyrl),
    sr_RS("Serbian (sr)", CountryCode.RS, LanguageScript.Cyrl),
    sr_Latn_BA("Serbian (sr)", CountryCode.BA, LanguageScript.Latn),
    sr_Latn_ME("Serbian (sr)", CountryCode.ME, LanguageScript.Latn),
    sr_Latn_RS("Serbian (sr)", CountryCode.RS, LanguageScript.Latn),
    sk_SK("Slovak (sk)", CountryCode.SK, LanguageScript.Latn),
    sl_SI("Slovenian (sl)", CountryCode.SI, LanguageScript.Latn),
    es_AR("Spanish (es)", CountryCode.AR, LanguageScript.Latn),
    es_BO("Spanish (es)", CountryCode.BO, LanguageScript.Latn),
    es_CL("Spanish (es)", CountryCode.CL, LanguageScript.Latn),
    es_CO("Spanish (es)", CountryCode.CO, LanguageScript.Latn),
    es_CR("Spanish (es)", CountryCode.CR, LanguageScript.Latn),
    es_DO("Spanish (es)", CountryCode.DO, LanguageScript.Latn),
    es_EC("Spanish (es)", CountryCode.EC, LanguageScript.Latn),
    es_SV("Spanish (es)", CountryCode.SV, LanguageScript.Latn),
    es_GT("Spanish (es)", CountryCode.GT, LanguageScript.Latn),
    es_HN("Spanish (es)", CountryCode.HN, LanguageScript.Latn),
    es_MX("Spanish (es)", CountryCode.MX, LanguageScript.Latn),
    es_NI("Spanish (es)", CountryCode.NL, LanguageScript.Latn),
    es_PA("Spanish (es)", CountryCode.PA, LanguageScript.Latn),
    es_PY("Spanish (es)", CountryCode.PY, LanguageScript.Latn),
    es_PE("Spanish (es)", CountryCode.PE, LanguageScript.Latn),
    es_PR("Spanish (es)", CountryCode.PR, LanguageScript.Latn),
    es_ES("Spanish (es)", CountryCode.ES, LanguageScript.Latn),
    es_US("Spanish (es)", CountryCode.US, LanguageScript.Latn),
    es_UY("Spanish (es)", CountryCode.UY, LanguageScript.Latn),
    es_VE("Spanish (es)", CountryCode.VE, LanguageScript.Latn),
    sv_SE("Swedish (sv)", CountryCode.SE, LanguageScript.Latn),
    th_TH("Thai (th)", CountryCode.TH, LanguageScript.Thai),
    th_TH_u_ca_buddhist("Thai (th)", CountryCode.TH, LanguageScript.Thai), // Implicitly specifies the Latin numbering system. Explicitly specifies the Script.Thai Buddhist calendar with java.util.Calendar.
    th_TH_u_ca_buddhist_nu_thai("Thai (th)", CountryCode.TH, LanguageScript.Thai), // Explicitly specifies the Script.Thai numbering system and the Script.Thai Buddhist calendar with java.util.Calendar.
    th_TH_x_lvariant_TH("Thai (th)", CountryCode.TH, LanguageScript.Thai), // Explicitly specifies the Thai numbering system and the Thai Buddhist calendar with java.util.Calendar. (For compatibility)
    tr_TR("Turkish (tr)", CountryCode.TR, LanguageScript.Latn),
    uk_UA("Ukrainian (uk)", CountryCode.UA, LanguageScript.Cyrl),
    vi_VN("Vietnamese (vi)", CountryCode.VN, LanguageScript.Latn);

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
