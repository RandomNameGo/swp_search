package swp.internmanagement.internmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swp.internmanagement.internmanagement.entity.Request;
import swp.internmanagement.internmanagement.payload.request.HelpRequest;
import swp.internmanagement.internmanagement.repository.RequestRepository;

@Service
public class RequestServiceImpl implements RequestService{

    @Autowired
    private RequestRepository requestRepository;

    @Override
    public Request sendRequest(HelpRequest helpRequest) {
        Request request = Request.build(0, helpRequest.getManagerId(), helpRequest.getMentorId(), helpRequest.getCoordinatorId(), helpRequest.getInternId(), helpRequest.getRequestType(), helpRequest.getRequestType(), helpRequest.getRequestStatus());
        return requestRepository.save(request);
    }
}
