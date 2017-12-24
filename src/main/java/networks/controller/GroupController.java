package networks.controller;

import networks.model.Group;
import networks.service.GroupService;
import networks.service.factory.ServiceFactory;
import networks.service.impl.GroupServiceImpl;

import java.io.IOException;
import java.util.List;

public class GroupController {

    public static void main(String[] args) throws IOException {

        GroupService groupService = ServiceFactory.getGroupService();

        List<Group> groups = groupService.getAll();
        for (Group elem : groups) {
            groupService.create(elem);
        }

    }
}
