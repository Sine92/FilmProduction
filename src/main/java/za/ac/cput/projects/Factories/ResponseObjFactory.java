package za.ac.cput.projects.Factories;

import za.ac.cput.projects.Domain.ResponseObj;

public class ResponseObjFactory {

    public static ResponseObj builderGenericResponseObj(String responseCode,String responseDescription)
    {
        return new ResponseObj(responseCode,responseDescription);
    }
}
