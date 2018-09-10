package acceptance.steps;

import com.kata.bdd.domain.VTC;
import com.kata.bdd.domain.repository.VTCRepository;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java8.En;

import java.util.List;
import java.util.Map;

public class VTCSteps implements En {
    public VTCSteps(VTCRepository vtcRepository) {
        Given("^des VTC existent:$", (DataTable vtcTable) -> {
            List<Map<String, String>> vtcMaps = vtcTable.asMaps(String.class, String.class);
            vtcMaps.forEach(vtcMap -> {
                VTC vtc = new VTC(vtcMap.get("id"), vtcMap.get("firstName"), vtcMap.get("lastName"));
                vtcRepository.add(vtc);
            });
        });
    }
}
