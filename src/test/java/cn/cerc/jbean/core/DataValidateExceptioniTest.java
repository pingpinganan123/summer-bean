package cn.cerc.jbean.core;

import org.junit.Test;

import cn.cerc.jbean.core.DataValidateException;

public class DataValidateExceptioniTest {

	@Test(expected = DataValidateException.class)
	public void test_stop_1() throws DataValidateException {
		DataValidateException.stopRun("限制通过的数据，否则报错", true);
	}

	@Test(expected = DataValidateException.class)
	public void test_stop_2() throws DataValidateException {
		DataValidateException.stopRun("限制通过的数据，否则报错", 1, 1);
	}

	@Test(expected = DataValidateException.class)
	public void test_stop_3() throws DataValidateException {
		DataValidateException.stopRun("限制通过的数据，否则报错", "", "");
	}
}
