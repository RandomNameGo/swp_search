package swp.internmanagement.internmanagement.service;

import swp.internmanagement.internmanagement.entity.Request;
import swp.internmanagement.internmanagement.payload.request.HelpRequest;

public interface RequestService {

    Request sendRequest(HelpRequest helpRequest);
}
