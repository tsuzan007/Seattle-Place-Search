package com.mark46.code.seattleplaces.Model.POJOs;

import java.util.List;

public class ResponseData {


    /**
     * meta : {"code":200,"requestId":"5ad78a884c1f671595d8f908"}
     * response : {"venues":[{"id":"52d456c811d24128cdd7bc8b","name":"Storyville Coffee Company","location":{"address":"1001 1st Ave","crossStreet":"at Madison St","lat":47.60475923205166,"lng":-122.33636210125788,"labeledLatLngs":[{"label":"display","lat":47.60475923205166,"lng":-122.33636210125788}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1001 1st Ave (at Madison St)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"57e95a82498e0a3995a43e90","name":"Anchorhead Coffee Co","location":{"address":"1600 7th Ave Ste 105","crossStreet":"Olive Way","lat":47.61340942776967,"lng":-122.33469499761385,"labeledLatLngs":[{"label":"display","lat":47.61340942776967,"lng":-122.33469499761385}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1600 7th Ave Ste 105 (Olive Way)","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"49d3e558f964a520225c1fe3","name":"Cherry Street Coffee House","location":{"address":"103 Cherry St","crossStreet":"at 1st Ave","lat":47.6027673689831,"lng":-122.33415096584942,"labeledLatLngs":[{"label":"display","lat":47.6027673689831,"lng":-122.33415096584942}],"postalCode":"98104","cc":"US","neighborhood":"Seattle Central Business District","city":"Seattle","state":"WA","country":"United States","formattedAddress":["103 Cherry St (at 1st Ave)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"545803de498e7e758ac5605e","name":"Elm Coffee Roasters","location":{"address":"240 2nd Avenue Ext S Ste 103","lat":47.600152370806754,"lng":-122.33094380272051,"labeledLatLngs":[{"label":"display","lat":47.600152370806754,"lng":-122.33094380272051}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["240 2nd Avenue Ext S Ste 103","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"52251f9511d2b2f238901956","name":"Storyville Coffee Company","location":{"address":"94 Pike St #34","crossStreet":"1st Ave (Pike Place Market)","lat":47.608968412285684,"lng":-122.34069716145795,"labeledLatLngs":[{"label":"display","lat":47.608968412285684,"lng":-122.34069716145795}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["94 Pike St #34 (1st Ave (Pike Place Market))","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"55fc6351498e081c6ae9a9c1","name":"Slate Coffee","location":{"address":"602 2nd Ave","crossStreet":"James St","lat":47.60226958101576,"lng":-122.33254930945151,"labeledLatLngs":[{"label":"display","lat":47.60226958101576,"lng":-122.33254930945151}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["602 2nd Ave (James St)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"569d5c6c498e4ff52aa8b724","name":"Olympia Coffee Roasters","location":{"address":"2021 7th Ave","lat":47.615100389907994,"lng":-122.3383441043283,"labeledLatLngs":[{"label":"display","lat":47.615100389907994,"lng":-122.3383441043283}],"postalCode":"98121","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["2021 7th Ave","Seattle, WA 98121","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4a609aa8f964a520ebc01fe3","name":"Pegasus Coffee","location":{"address":"711 3rd Ave","crossStreet":"at Cherry St","lat":47.603689,"lng":-122.332502,"labeledLatLngs":[{"label":"display","lat":47.603689,"lng":-122.332502}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["711 3rd Ave (at Cherry St)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4a53845cf964a5205eb21fe3","name":"Tully's Coffee","location":{"address":"821 2nd Ave Ste 402","crossStreet":"btw Marion & Columbia","lat":47.604219783711095,"lng":-122.3346137579619,"labeledLatLngs":[{"label":"display","lat":47.604219783711095,"lng":-122.3346137579619}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["821 2nd Ave Ste 402 (btw Marion & Columbia)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4a848900f964a520e3fc1fe3","name":"Cherry Street Coffee House","location":{"address":"808 3rd Ave","crossStreet":"btw Marion & Columbia","lat":47.60451120781553,"lng":-122.3330104220454,"labeledLatLngs":[{"label":"display","lat":47.60451120781553,"lng":-122.3330104220454}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["808 3rd Ave (btw Marion & Columbia)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"475ebc58f964a520d94c1fe3","name":"Kaladi Brothers Coffee","location":{"address":"517 E Pike St","crossStreet":"at Belmont Ave.","lat":47.61415161351147,"lng":-122.32456505977603,"labeledLatLngs":[{"label":"display","lat":47.61415161351147,"lng":-122.32456505977603}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["517 E Pike St (at Belmont Ave.)","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4aa1a711f964a520684120e3","name":"Cherry Street Coffee House","location":{"address":"2121 1st Ave","crossStreet":"Btw Blanchard & Lenora St.","lat":47.61224159203839,"lng":-122.34474021390412,"labeledLatLngs":[{"label":"display","lat":47.61224159203839,"lng":-122.34474021390412}],"postalCode":"98121","cc":"US","neighborhood":"Belltown","city":"Seattle","state":"WA","country":"United States","formattedAddress":["2121 1st Ave (Btw Blanchard & Lenora St.)","Seattle, WA 98121","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4412e177f964a520db301fe3","name":"Panama Hotel Tea & Coffee","location":{"address":"607 S Main St","crossStreet":"btwn 6th & Maynard Ave. S","lat":47.59997006448296,"lng":-122.32614684210247,"labeledLatLngs":[{"label":"display","lat":47.59997006448296,"lng":-122.32614684210247}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["607 S Main St (btwn 6th & Maynard Ave. S)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4b5daa3ff964a520cc6529e3","name":"Pegasus Coffee","location":{"address":"1218 3rd Ave","crossStreet":"at Seneca St","lat":47.60755521415362,"lng":-122.33584527606352,"labeledLatLngs":[{"label":"display","lat":47.60755521415362,"lng":-122.33584527606352}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1218 3rd Ave (at Seneca St)","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4a26f5c5f964a520f47e1fe3","name":"Bedlam Coffee","location":{"address":"2231 2nd Ave","crossStreet":"Bell St","lat":47.613948460584,"lng":-122.34548328955584,"labeledLatLngs":[{"label":"display","lat":47.613948460584,"lng":-122.34548328955584}],"postalCode":"98121","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["2231 2nd Ave (Bell St)","Seattle, WA 98121","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"venuePage":{"id":"89452925"},"referralId":"v-1524075144","hasPerk":false},{"id":"4a7b455ef964a52089ea1fe3","name":"Stumptown Coffee Roasters","location":{"address":"1115 12th Ave","crossStreet":"at Spring St","lat":47.61203641962361,"lng":-122.31700301170349,"labeledLatLngs":[{"label":"display","lat":47.61203641962361,"lng":-122.31700301170349}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1115 12th Ave (at Spring St)","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4a63a829f964a52087c51fe3","name":"Cupcake Royale and Vérité Coffee","location":{"address":"1111 E Pike St","crossStreet":"btwn 11th & 12th Ave","lat":47.614013174009195,"lng":-122.31760626759302,"labeledLatLngs":[{"label":"display","lat":47.614013174009195,"lng":-122.31760626759302}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1111 E Pike St (btwn 11th & 12th Ave)","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1bc941735","name":"Cupcake Shop","pluralName":"Cupcake Shops","shortName":"Cupcakes","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/cupcakes_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"49de6c3df964a5204e601fe3","name":"Cherry Street Coffee House","location":{"address":"2719 1st Ave","crossStreet":"at Clay St","lat":47.61626578219188,"lng":-122.35156979634606,"labeledLatLngs":[{"label":"display","lat":47.61626578219188,"lng":-122.35156979634606}],"postalCode":"98121","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["2719 1st Ave (at Clay St)","Seattle, WA 98121","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"5802b14d38fa7d4a74864fe9","name":"Urban Coffee House","location":{"address":"1900 4th Ave","lat":47.612412527281144,"lng":-122.3386644359043,"labeledLatLngs":[{"label":"display","lat":47.612412527281144,"lng":-122.3386644359043}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1900 4th Ave","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"509a9305e4b05e3770ebe234","name":"Rococo Coffee Roasting","location":{"address":"207 Boren Ave N","crossStreet":"John And Boren N","lat":47.62023771347799,"lng":-122.33598581355247,"labeledLatLngs":[{"label":"display","lat":47.62023771347799,"lng":-122.33598581355247}],"postalCode":"98109","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["207 Boren Ave N (John And Boren N)","Seattle, WA 98109","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4b039cd5f964a520e34f22e3","name":"Roy Street Coffee & Tea","location":{"address":"700 Broadway E","crossStreet":"at E Roy St","lat":47.62519629325031,"lng":-122.32125608699589,"labeledLatLngs":[{"label":"display","lat":47.62519629325031,"lng":-122.32125608699589}],"postalCode":"98102","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["700 Broadway E (at E Roy St)","Seattle, WA 98102","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4d9a26313182236a0e5cf0b8","name":"Zoka Coffee","location":{"address":"351 Boren Ave N","crossStreet":"at Harrison St","lat":47.62156087305894,"lng":-122.33618291124257,"labeledLatLngs":[{"label":"display","lat":47.62156087305894,"lng":-122.33618291124257}],"postalCode":"98109","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["351 Boren Ave N (at Harrison St)","Seattle, WA 98109","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"49d541dcf964a520805c1fe3","name":"Broadcast Coffee","location":{"address":"1918 E Yesler Way","lat":47.6017296721064,"lng":-122.30650437872471,"labeledLatLngs":[{"label":"display","lat":47.6017296721064,"lng":-122.30650437872471}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1918 E Yesler Way","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4b05a7b3f964a52054e022e3","name":"Tully's Coffee - Two Union","location":{"address":"601 Union","lat":47.610529120093965,"lng":-122.33196358381109,"labeledLatLngs":[{"label":"display","lat":47.610529120093965,"lng":-122.33196358381109}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["601 Union","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"56fecbc2498e190dff650557","name":"Peet's Coffee & Tea","location":{"lat":47.610033,"lng":-122.335019,"labeledLatLngs":[{"label":"display","lat":47.610033,"lng":-122.335019}],"cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["Seattle, WA","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"525c4e0611d2d13efe2e2f8e","name":"Cherry Street Coffee","location":{"address":"509 Olive Way","crossStreet":"at 5th Ave","lat":47.61293233674729,"lng":-122.33701681216874,"labeledLatLngs":[{"label":"display","lat":47.61293233674729,"lng":-122.33701681216874}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["509 Olive Way (at 5th Ave)","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d16d941735","name":"Café","pluralName":"Cafés","shortName":"Café","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/cafe_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"57c5d9cb498e9cb25dc2485a","name":"Cherry Street Coffee","location":{"address":"500 Fairview Ave. N","lat":47.62323896654146,"lng":-122.33431324364395,"labeledLatLngs":[{"label":"display","lat":47.62323896654146,"lng":-122.33431324364395}],"postalCode":"98109","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["500 Fairview Ave. N","Seattle, WA 98109","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"46a0f9ccf964a52022491fe3","name":"Tougo Coffee Co.","location":{"address":"1410 18th Ave","crossStreet":"E Union St.","lat":47.61328823484205,"lng":-122.30873125275592,"labeledLatLngs":[{"label":"display","lat":47.61328823484205,"lng":-122.30873125275592}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1410 18th Ave (E Union St.)","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4a54fc5ff964a52084b31fe3","name":"Porchlight Coffee & Records","location":{"address":"1517 14th Ave","crossStreet":"14th and Pike","lat":47.61452718423642,"lng":-122.31409060805531,"labeledLatLngs":[{"label":"display","lat":47.61452718423642,"lng":-122.31409060805531}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1517 14th Ave (14th and Pike)","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"venuePage":{"id":"48271113"},"referralId":"v-1524075144","hasPerk":false},{"id":"46681722f964a5208b471fe3","name":"Seattle Coffee Works","location":{"address":"107 Pike St","crossStreet":"btwn 1st & 2nd Ave","lat":47.60900953263863,"lng":-122.33965760161327,"labeledLatLngs":[{"label":"display","lat":47.60900953263863,"lng":-122.33965760161327}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["107 Pike St (btwn 1st & 2nd Ave)","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"venuePage":{"id":"62227447"},"referralId":"v-1524075144","hasPerk":false}],"geocode":{"what":"","where":"seattle wa","feature":{"cc":"US","name":"Seattle","displayName":"Seattle, WA, United States","matchedName":"Seattle, WA, United States","highlightedName":"<b>Seattle<\/b>, <b>WA<\/b>, United States","woeType":7,"slug":"seattle-washington","id":"geonameid:5809844","longId":"72057594043737780","geometry":{"center":{"lat":47.60621,"lng":-122.33207},"bounds":{"ne":{"lat":47.734145,"lng":-122.224433},"sw":{"lat":47.481719999999996,"lng":-122.459696}}}},"parents":[]}}
     */

    private MetaBean meta;
    private ResponseBean response;


    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }


    public static class MetaBean {
        /**
         * code : 200
         * requestId : 5ad78a884c1f671595d8f908
         */

        private int code;
        private String requestId;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getRequestId() {
            return requestId;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }
    }

    public static class ResponseBean {
        /**
         * venues : [{"id":"52d456c811d24128cdd7bc8b","name":"Storyville Coffee Company","location":{"address":"1001 1st Ave","crossStreet":"at Madison St","lat":47.60475923205166,"lng":-122.33636210125788,"labeledLatLngs":[{"label":"display","lat":47.60475923205166,"lng":-122.33636210125788}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1001 1st Ave (at Madison St)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"57e95a82498e0a3995a43e90","name":"Anchorhead Coffee Co","location":{"address":"1600 7th Ave Ste 105","crossStreet":"Olive Way","lat":47.61340942776967,"lng":-122.33469499761385,"labeledLatLngs":[{"label":"display","lat":47.61340942776967,"lng":-122.33469499761385}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1600 7th Ave Ste 105 (Olive Way)","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"49d3e558f964a520225c1fe3","name":"Cherry Street Coffee House","location":{"address":"103 Cherry St","crossStreet":"at 1st Ave","lat":47.6027673689831,"lng":-122.33415096584942,"labeledLatLngs":[{"label":"display","lat":47.6027673689831,"lng":-122.33415096584942}],"postalCode":"98104","cc":"US","neighborhood":"Seattle Central Business District","city":"Seattle","state":"WA","country":"United States","formattedAddress":["103 Cherry St (at 1st Ave)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"545803de498e7e758ac5605e","name":"Elm Coffee Roasters","location":{"address":"240 2nd Avenue Ext S Ste 103","lat":47.600152370806754,"lng":-122.33094380272051,"labeledLatLngs":[{"label":"display","lat":47.600152370806754,"lng":-122.33094380272051}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["240 2nd Avenue Ext S Ste 103","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"52251f9511d2b2f238901956","name":"Storyville Coffee Company","location":{"address":"94 Pike St #34","crossStreet":"1st Ave (Pike Place Market)","lat":47.608968412285684,"lng":-122.34069716145795,"labeledLatLngs":[{"label":"display","lat":47.608968412285684,"lng":-122.34069716145795}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["94 Pike St #34 (1st Ave (Pike Place Market))","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"55fc6351498e081c6ae9a9c1","name":"Slate Coffee","location":{"address":"602 2nd Ave","crossStreet":"James St","lat":47.60226958101576,"lng":-122.33254930945151,"labeledLatLngs":[{"label":"display","lat":47.60226958101576,"lng":-122.33254930945151}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["602 2nd Ave (James St)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"569d5c6c498e4ff52aa8b724","name":"Olympia Coffee Roasters","location":{"address":"2021 7th Ave","lat":47.615100389907994,"lng":-122.3383441043283,"labeledLatLngs":[{"label":"display","lat":47.615100389907994,"lng":-122.3383441043283}],"postalCode":"98121","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["2021 7th Ave","Seattle, WA 98121","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4a609aa8f964a520ebc01fe3","name":"Pegasus Coffee","location":{"address":"711 3rd Ave","crossStreet":"at Cherry St","lat":47.603689,"lng":-122.332502,"labeledLatLngs":[{"label":"display","lat":47.603689,"lng":-122.332502}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["711 3rd Ave (at Cherry St)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4a53845cf964a5205eb21fe3","name":"Tully's Coffee","location":{"address":"821 2nd Ave Ste 402","crossStreet":"btw Marion & Columbia","lat":47.604219783711095,"lng":-122.3346137579619,"labeledLatLngs":[{"label":"display","lat":47.604219783711095,"lng":-122.3346137579619}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["821 2nd Ave Ste 402 (btw Marion & Columbia)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4a848900f964a520e3fc1fe3","name":"Cherry Street Coffee House","location":{"address":"808 3rd Ave","crossStreet":"btw Marion & Columbia","lat":47.60451120781553,"lng":-122.3330104220454,"labeledLatLngs":[{"label":"display","lat":47.60451120781553,"lng":-122.3330104220454}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["808 3rd Ave (btw Marion & Columbia)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"475ebc58f964a520d94c1fe3","name":"Kaladi Brothers Coffee","location":{"address":"517 E Pike St","crossStreet":"at Belmont Ave.","lat":47.61415161351147,"lng":-122.32456505977603,"labeledLatLngs":[{"label":"display","lat":47.61415161351147,"lng":-122.32456505977603}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["517 E Pike St (at Belmont Ave.)","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4aa1a711f964a520684120e3","name":"Cherry Street Coffee House","location":{"address":"2121 1st Ave","crossStreet":"Btw Blanchard & Lenora St.","lat":47.61224159203839,"lng":-122.34474021390412,"labeledLatLngs":[{"label":"display","lat":47.61224159203839,"lng":-122.34474021390412}],"postalCode":"98121","cc":"US","neighborhood":"Belltown","city":"Seattle","state":"WA","country":"United States","formattedAddress":["2121 1st Ave (Btw Blanchard & Lenora St.)","Seattle, WA 98121","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4412e177f964a520db301fe3","name":"Panama Hotel Tea & Coffee","location":{"address":"607 S Main St","crossStreet":"btwn 6th & Maynard Ave. S","lat":47.59997006448296,"lng":-122.32614684210247,"labeledLatLngs":[{"label":"display","lat":47.59997006448296,"lng":-122.32614684210247}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["607 S Main St (btwn 6th & Maynard Ave. S)","Seattle, WA 98104","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4b5daa3ff964a520cc6529e3","name":"Pegasus Coffee","location":{"address":"1218 3rd Ave","crossStreet":"at Seneca St","lat":47.60755521415362,"lng":-122.33584527606352,"labeledLatLngs":[{"label":"display","lat":47.60755521415362,"lng":-122.33584527606352}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1218 3rd Ave (at Seneca St)","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4a26f5c5f964a520f47e1fe3","name":"Bedlam Coffee","location":{"address":"2231 2nd Ave","crossStreet":"Bell St","lat":47.613948460584,"lng":-122.34548328955584,"labeledLatLngs":[{"label":"display","lat":47.613948460584,"lng":-122.34548328955584}],"postalCode":"98121","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["2231 2nd Ave (Bell St)","Seattle, WA 98121","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"venuePage":{"id":"89452925"},"referralId":"v-1524075144","hasPerk":false},{"id":"4a7b455ef964a52089ea1fe3","name":"Stumptown Coffee Roasters","location":{"address":"1115 12th Ave","crossStreet":"at Spring St","lat":47.61203641962361,"lng":-122.31700301170349,"labeledLatLngs":[{"label":"display","lat":47.61203641962361,"lng":-122.31700301170349}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1115 12th Ave (at Spring St)","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4a63a829f964a52087c51fe3","name":"Cupcake Royale and Vérité Coffee","location":{"address":"1111 E Pike St","crossStreet":"btwn 11th & 12th Ave","lat":47.614013174009195,"lng":-122.31760626759302,"labeledLatLngs":[{"label":"display","lat":47.614013174009195,"lng":-122.31760626759302}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1111 E Pike St (btwn 11th & 12th Ave)","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1bc941735","name":"Cupcake Shop","pluralName":"Cupcake Shops","shortName":"Cupcakes","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/cupcakes_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"49de6c3df964a5204e601fe3","name":"Cherry Street Coffee House","location":{"address":"2719 1st Ave","crossStreet":"at Clay St","lat":47.61626578219188,"lng":-122.35156979634606,"labeledLatLngs":[{"label":"display","lat":47.61626578219188,"lng":-122.35156979634606}],"postalCode":"98121","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["2719 1st Ave (at Clay St)","Seattle, WA 98121","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"5802b14d38fa7d4a74864fe9","name":"Urban Coffee House","location":{"address":"1900 4th Ave","lat":47.612412527281144,"lng":-122.3386644359043,"labeledLatLngs":[{"label":"display","lat":47.612412527281144,"lng":-122.3386644359043}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1900 4th Ave","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"509a9305e4b05e3770ebe234","name":"Rococo Coffee Roasting","location":{"address":"207 Boren Ave N","crossStreet":"John And Boren N","lat":47.62023771347799,"lng":-122.33598581355247,"labeledLatLngs":[{"label":"display","lat":47.62023771347799,"lng":-122.33598581355247}],"postalCode":"98109","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["207 Boren Ave N (John And Boren N)","Seattle, WA 98109","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4b039cd5f964a520e34f22e3","name":"Roy Street Coffee & Tea","location":{"address":"700 Broadway E","crossStreet":"at E Roy St","lat":47.62519629325031,"lng":-122.32125608699589,"labeledLatLngs":[{"label":"display","lat":47.62519629325031,"lng":-122.32125608699589}],"postalCode":"98102","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["700 Broadway E (at E Roy St)","Seattle, WA 98102","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4d9a26313182236a0e5cf0b8","name":"Zoka Coffee","location":{"address":"351 Boren Ave N","crossStreet":"at Harrison St","lat":47.62156087305894,"lng":-122.33618291124257,"labeledLatLngs":[{"label":"display","lat":47.62156087305894,"lng":-122.33618291124257}],"postalCode":"98109","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["351 Boren Ave N (at Harrison St)","Seattle, WA 98109","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"49d541dcf964a520805c1fe3","name":"Broadcast Coffee","location":{"address":"1918 E Yesler Way","lat":47.6017296721064,"lng":-122.30650437872471,"labeledLatLngs":[{"label":"display","lat":47.6017296721064,"lng":-122.30650437872471}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1918 E Yesler Way","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4b05a7b3f964a52054e022e3","name":"Tully's Coffee - Two Union","location":{"address":"601 Union","lat":47.610529120093965,"lng":-122.33196358381109,"labeledLatLngs":[{"label":"display","lat":47.610529120093965,"lng":-122.33196358381109}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["601 Union","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"56fecbc2498e190dff650557","name":"Peet's Coffee & Tea","location":{"lat":47.610033,"lng":-122.335019,"labeledLatLngs":[{"label":"display","lat":47.610033,"lng":-122.335019}],"cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["Seattle, WA","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"525c4e0611d2d13efe2e2f8e","name":"Cherry Street Coffee","location":{"address":"509 Olive Way","crossStreet":"at 5th Ave","lat":47.61293233674729,"lng":-122.33701681216874,"labeledLatLngs":[{"label":"display","lat":47.61293233674729,"lng":-122.33701681216874}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["509 Olive Way (at 5th Ave)","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d16d941735","name":"Café","pluralName":"Cafés","shortName":"Café","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/cafe_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"57c5d9cb498e9cb25dc2485a","name":"Cherry Street Coffee","location":{"address":"500 Fairview Ave. N","lat":47.62323896654146,"lng":-122.33431324364395,"labeledLatLngs":[{"label":"display","lat":47.62323896654146,"lng":-122.33431324364395}],"postalCode":"98109","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["500 Fairview Ave. N","Seattle, WA 98109","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"46a0f9ccf964a52022491fe3","name":"Tougo Coffee Co.","location":{"address":"1410 18th Ave","crossStreet":"E Union St.","lat":47.61328823484205,"lng":-122.30873125275592,"labeledLatLngs":[{"label":"display","lat":47.61328823484205,"lng":-122.30873125275592}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1410 18th Ave (E Union St.)","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"referralId":"v-1524075144","hasPerk":false},{"id":"4a54fc5ff964a52084b31fe3","name":"Porchlight Coffee & Records","location":{"address":"1517 14th Ave","crossStreet":"14th and Pike","lat":47.61452718423642,"lng":-122.31409060805531,"labeledLatLngs":[{"label":"display","lat":47.61452718423642,"lng":-122.31409060805531}],"postalCode":"98122","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1517 14th Ave (14th and Pike)","Seattle, WA 98122","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"venuePage":{"id":"48271113"},"referralId":"v-1524075144","hasPerk":false},{"id":"46681722f964a5208b471fe3","name":"Seattle Coffee Works","location":{"address":"107 Pike St","crossStreet":"btwn 1st & 2nd Ave","lat":47.60900953263863,"lng":-122.33965760161327,"labeledLatLngs":[{"label":"display","lat":47.60900953263863,"lng":-122.33965760161327}],"postalCode":"98101","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["107 Pike St (btwn 1st & 2nd Ave)","Seattle, WA 98101","United States"]},"categories":[{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}],"venuePage":{"id":"62227447"},"referralId":"v-1524075144","hasPerk":false}]
         * geocode : {"what":"","where":"seattle wa","feature":{"cc":"US","name":"Seattle","displayName":"Seattle, WA, United States","matchedName":"Seattle, WA, United States","highlightedName":"<b>Seattle<\/b>, <b>WA<\/b>, United States","woeType":7,"slug":"seattle-washington","id":"geonameid:5809844","longId":"72057594043737780","geometry":{"center":{"lat":47.60621,"lng":-122.33207},"bounds":{"ne":{"lat":47.734145,"lng":-122.224433},"sw":{"lat":47.481719999999996,"lng":-122.459696}}}},"parents":[]}
         */

        private GeocodeBean geocode;
        private List<VenuesBean> venues;

        public GeocodeBean getGeocode() {
            return geocode;
        }

        public void setGeocode(GeocodeBean geocode) {
            this.geocode = geocode;
        }

        public List<VenuesBean> getVenues() {
            return venues;
        }

        public void setVenues(List<VenuesBean> venues) {
            this.venues = venues;
        }

        public static class GeocodeBean {
            /**
             * what :
             * where : seattle wa
             * feature : {"cc":"US","name":"Seattle","displayName":"Seattle, WA, United States","matchedName":"Seattle, WA, United States","highlightedName":"<b>Seattle<\/b>, <b>WA<\/b>, United States","woeType":7,"slug":"seattle-washington","id":"geonameid:5809844","longId":"72057594043737780","geometry":{"center":{"lat":47.60621,"lng":-122.33207},"bounds":{"ne":{"lat":47.734145,"lng":-122.224433},"sw":{"lat":47.481719999999996,"lng":-122.459696}}}}
             * parents : []
             */

            private String what;
            private String where;
            private FeatureBean feature;
            private List<?> parents;

            public String getWhat() {
                return what;
            }

            public void setWhat(String what) {
                this.what = what;
            }

            public String getWhere() {
                return where;
            }

            public void setWhere(String where) {
                this.where = where;
            }

            public FeatureBean getFeature() {
                return feature;
            }

            public void setFeature(FeatureBean feature) {
                this.feature = feature;
            }

            public List<?> getParents() {
                return parents;
            }

            public void setParents(List<?> parents) {
                this.parents = parents;
            }

            public static class FeatureBean {
                /**
                 * cc : US
                 * name : Seattle
                 * displayName : Seattle, WA, United States
                 * matchedName : Seattle, WA, United States
                 * highlightedName : <b>Seattle</b>, <b>WA</b>, United States
                 * woeType : 7
                 * slug : seattle-washington
                 * id : geonameid:5809844
                 * longId : 72057594043737780
                 * geometry : {"center":{"lat":47.60621,"lng":-122.33207},"bounds":{"ne":{"lat":47.734145,"lng":-122.224433},"sw":{"lat":47.481719999999996,"lng":-122.459696}}}
                 */

                private String cc;
                private String name;
                private String displayName;
                private String matchedName;
                private String highlightedName;
                private int woeType;
                private String slug;
                private String id;
                private String longId;
                private GeometryBean geometry;

                public String getCc() {
                    return cc;
                }

                public void setCc(String cc) {
                    this.cc = cc;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getDisplayName() {
                    return displayName;
                }

                public void setDisplayName(String displayName) {
                    this.displayName = displayName;
                }

                public String getMatchedName() {
                    return matchedName;
                }

                public void setMatchedName(String matchedName) {
                    this.matchedName = matchedName;
                }

                public String getHighlightedName() {
                    return highlightedName;
                }

                public void setHighlightedName(String highlightedName) {
                    this.highlightedName = highlightedName;
                }

                public int getWoeType() {
                    return woeType;
                }

                public void setWoeType(int woeType) {
                    this.woeType = woeType;
                }

                public String getSlug() {
                    return slug;
                }

                public void setSlug(String slug) {
                    this.slug = slug;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getLongId() {
                    return longId;
                }

                public void setLongId(String longId) {
                    this.longId = longId;
                }

                public GeometryBean getGeometry() {
                    return geometry;
                }

                public void setGeometry(GeometryBean geometry) {
                    this.geometry = geometry;
                }

                public static class GeometryBean {
                    /**
                     * center : {"lat":47.60621,"lng":-122.33207}
                     * bounds : {"ne":{"lat":47.734145,"lng":-122.224433},"sw":{"lat":47.481719999999996,"lng":-122.459696}}
                     */

                    private CenterBean center;
                    private BoundsBean bounds;

                    public CenterBean getCenter() {
                        return center;
                    }

                    public void setCenter(CenterBean center) {
                        this.center = center;
                    }

                    public BoundsBean getBounds() {
                        return bounds;
                    }

                    public void setBounds(BoundsBean bounds) {
                        this.bounds = bounds;
                    }

                    public static class CenterBean {
                        /**
                         * lat : 47.60621
                         * lng : -122.33207
                         */

                        private double lat;
                        private double lng;

                        public double getLat() {
                            return lat;
                        }

                        public void setLat(double lat) {
                            this.lat = lat;
                        }

                        public double getLng() {
                            return lng;
                        }

                        public void setLng(double lng) {
                            this.lng = lng;
                        }
                    }

                    public static class BoundsBean {
                        /**
                         * ne : {"lat":47.734145,"lng":-122.224433}
                         * sw : {"lat":47.481719999999996,"lng":-122.459696}
                         */

                        private NeBean ne;
                        private SwBean sw;

                        public NeBean getNe() {
                            return ne;
                        }

                        public void setNe(NeBean ne) {
                            this.ne = ne;
                        }

                        public SwBean getSw() {
                            return sw;
                        }

                        public void setSw(SwBean sw) {
                            this.sw = sw;
                        }

                        public static class NeBean {
                            /**
                             * lat : 47.734145
                             * lng : -122.224433
                             */

                            private double lat;
                            private double lng;

                            public double getLat() {
                                return lat;
                            }

                            public void setLat(double lat) {
                                this.lat = lat;
                            }

                            public double getLng() {
                                return lng;
                            }

                            public void setLng(double lng) {
                                this.lng = lng;
                            }
                        }

                        public static class SwBean {
                            /**
                             * lat : 47.481719999999996
                             * lng : -122.459696
                             */

                            private double lat;
                            private double lng;

                            public double getLat() {
                                return lat;
                            }

                            public void setLat(double lat) {
                                this.lat = lat;
                            }

                            public double getLng() {
                                return lng;
                            }

                            public void setLng(double lng) {
                                this.lng = lng;
                            }
                        }
                    }
                }
            }
        }

        public static class VenuesBean {
            /**
             * id : 52d456c811d24128cdd7bc8b
             * name : Storyville Coffee Company
             * location : {"address":"1001 1st Ave","crossStreet":"at Madison St","lat":47.60475923205166,"lng":-122.33636210125788,"labeledLatLngs":[{"label":"display","lat":47.60475923205166,"lng":-122.33636210125788}],"postalCode":"98104","cc":"US","city":"Seattle","state":"WA","country":"United States","formattedAddress":["1001 1st Ave (at Madison St)","Seattle, WA 98104","United States"]}
             * categories : [{"id":"4bf58dd8d48988d1e0931735","name":"Coffee Shop","pluralName":"Coffee Shops","shortName":"Coffee Shop","icon":{"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"},"primary":true}]
             * referralId : v-1524075144
             * hasPerk : false
             * venuePage : {"id":"89452925"}
             */

            private String id;
            private String name;
            private LocationBean location;
            private String referralId;
            private boolean hasPerk;
            private VenuePageBean venuePage;
            private List<CategoriesBean> categories;
            private boolean favourite=false;

            public boolean isFavourite() {
                return favourite;
            }

            public void setFavourite(boolean favourite) {
                this.favourite = favourite;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public String getReferralId() {
                return referralId;
            }

            public void setReferralId(String referralId) {
                this.referralId = referralId;
            }

            public boolean isHasPerk() {
                return hasPerk;
            }

            public void setHasPerk(boolean hasPerk) {
                this.hasPerk = hasPerk;
            }

            public VenuePageBean getVenuePage() {
                return venuePage;
            }

            public void setVenuePage(VenuePageBean venuePage) {
                this.venuePage = venuePage;
            }

            public List<CategoriesBean> getCategories() {
                return categories;
            }

            public void setCategories(List<CategoriesBean> categories) {
                this.categories = categories;
            }

            public static class LocationBean {
                /**
                 * address : 1001 1st Ave
                 * crossStreet : at Madison St
                 * lat : 47.60475923205166
                 * lng : -122.33636210125788
                 * labeledLatLngs : [{"label":"display","lat":47.60475923205166,"lng":-122.33636210125788}]
                 * postalCode : 98104
                 * cc : US
                 * city : Seattle
                 * state : WA
                 * country : United States
                 * formattedAddress : ["1001 1st Ave (at Madison St)","Seattle, WA 98104","United States"]
                 */

                private String address;
                private String crossStreet;
                private double lat;
                private double lng;
                private String postalCode;
                private String cc;
                private String city;
                private String state;
                private String country;
                private List<LabeledLatLngsBean> labeledLatLngs;
                private List<String> formattedAddress;

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public String getCrossStreet() {
                    return crossStreet;
                }

                public void setCrossStreet(String crossStreet) {
                    this.crossStreet = crossStreet;
                }

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }

                public String getPostalCode() {
                    return postalCode;
                }

                public void setPostalCode(String postalCode) {
                    this.postalCode = postalCode;
                }

                public String getCc() {
                    return cc;
                }

                public void setCc(String cc) {
                    this.cc = cc;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getState() {
                    return state;
                }

                public void setState(String state) {
                    this.state = state;
                }

                public String getCountry() {
                    return country;
                }

                public void setCountry(String country) {
                    this.country = country;
                }

                public List<LabeledLatLngsBean> getLabeledLatLngs() {
                    return labeledLatLngs;
                }

                public void setLabeledLatLngs(List<LabeledLatLngsBean> labeledLatLngs) {
                    this.labeledLatLngs = labeledLatLngs;
                }

                public List<String> getFormattedAddress() {
                    return formattedAddress;
                }

                public void setFormattedAddress(List<String> formattedAddress) {
                    this.formattedAddress = formattedAddress;
                }

                public static class LabeledLatLngsBean {
                    /**
                     * label : display
                     * lat : 47.60475923205166
                     * lng : -122.33636210125788
                     */

                    private String label;
                    private double lat;
                    private double lng;

                    public String getLabel() {
                        return label;
                    }

                    public void setLabel(String label) {
                        this.label = label;
                    }

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }

            public static class VenuePageBean {
                /**
                 * id : 89452925
                 */

                private String id;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }
            }

            public static class CategoriesBean {
                /**
                 * id : 4bf58dd8d48988d1e0931735
                 * name : Coffee Shop
                 * pluralName : Coffee Shops
                 * shortName : Coffee Shop
                 * icon : {"prefix":"https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_","suffix":".png"}
                 * primary : true
                 */

                private String id;
                private String name;
                private String pluralName;
                private String shortName;
                private IconBean icon;
                private boolean primary;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPluralName() {
                    return pluralName;
                }

                public void setPluralName(String pluralName) {
                    this.pluralName = pluralName;
                }

                public String getShortName() {
                    return shortName;
                }

                public void setShortName(String shortName) {
                    this.shortName = shortName;
                }

                public IconBean getIcon() {
                    return icon;
                }

                public void setIcon(IconBean icon) {
                    this.icon = icon;
                }

                public boolean isPrimary() {
                    return primary;
                }

                public void setPrimary(boolean primary) {
                    this.primary = primary;
                }

                public static class IconBean {
                    /**
                     * prefix : https://ss3.4sqi.net/img/categories_v2/food/coffeeshop_
                     * suffix : .png
                     */

                    private String prefix;
                    private String suffix;

                    public String getPrefix() {
                        return prefix;
                    }

                    public void setPrefix(String prefix) {
                        this.prefix = prefix;
                    }

                    public String getSuffix() {
                        return suffix;
                    }

                    public void setSuffix(String suffix) {
                        this.suffix = suffix;
                    }
                }
            }
        }
    }
}
