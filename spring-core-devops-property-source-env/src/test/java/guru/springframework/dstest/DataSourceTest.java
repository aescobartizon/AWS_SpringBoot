package guru.springframework.dstest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import guru.springframework.test.config.DataSourceConfig;
import guru.springframework.test.ds.FakeDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DataSourceConfig.class)
@ActiveProfiles("qa")
public class DataSourceTest {


	private FakeDataSource fakeDataSource;
	
	@Autowired
	private void setFakeDataSource(FakeDataSource fakeDataSource) {
		this.fakeDataSource=fakeDataSource;
	}
	
	@Test
	public void TestDataSource() throws Exception{
		System.out.println(fakeDataSource.getConnectionInfo());
	}
	

}

