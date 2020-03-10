package lxx.community.demo.MyTest;

import com.google.gson.Gson;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping(value = {"/test"})
public class RestTest {

    @Autowired
    RestTemplate restTemplate;

    private Gson gson = new Gson();

    private String url="http://10.100.249.92:8679/rcu/opStart";
    /**
     * 巡检控制接口
     */
    @RequestMapping(value = "/opScene",method = {RequestMethod.POST})
    @ResponseBody
    public XieZhuReturnJson opScene(@RequestBody String jsonObject){
        XieZhuReturnJson xieZhuReturnJson=null;
        opSceneDto opSceneDto= gson.fromJson(jsonObject, opSceneDto.class);
        String providerId = opSceneDto.getProviderId();
        JSONObject json=new JSONObject();
        try {
            json.put("hotelId",opSceneDto.getHotelId());
            json.put("roomName",opSceneDto.getRoomName());
            json.put("sourceType",providerId);
            json.put("providerId",providerId);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        HttpHeaders httpHeaders=new HttpHeaders();
        HttpEntity<String> req=new HttpEntity<>(json.toString(),httpHeaders);
        xieZhuReturnJson = restTemplate.postForObject(url, req, XieZhuReturnJson.class);
        return xieZhuReturnJson;
    }


}
