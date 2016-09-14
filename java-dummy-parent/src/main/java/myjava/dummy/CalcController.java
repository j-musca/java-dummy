package myjava.dummy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalcController {

    private final CalcService calcService;

    @Autowired
    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/calc/sum", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Result sum(@RequestParam("numbers") int[] numbers) {
        return new Result(calcService.sum(numbers));
    }
}
