package com.mis.ins.resource;

import java.util.ArrayList;
import java.util.List;

public class Resource {

	private List<Presenter> lisPresenter = new ArrayList<Presenter>();

	public List<Presenter> initPresenterList() {

		lisPresenter.add(new Presenter("D", "16789", "安德罗妮"));
		lisPresenter.add(new Presenter("D", "57321", "bill"));
		lisPresenter.add(new Presenter("P", "10003", "星苏"));
		lisPresenter.add(new Presenter("P", "10027", "瓦娘"));
		lisPresenter.add(new Presenter("P", "10455", "少帮主"));
		lisPresenter.add(new Presenter("P", "10025", "冰蓝飞狐"));
		lisPresenter.add(new Presenter("P", "10027", "瓦利拉"));
		lisPresenter.add(new Presenter("D", "208114", "狗贼"));
		lisPresenter.add(new Presenter("D", "57321", "bill"));
		lisPresenter.add(new Presenter("D", "319598", "Burning"));
		lisPresenter.add(new Presenter("D", "96291", "东北大鹌鹑 "));


		return lisPresenter;
	}

	public List<Presenter> getLisPresenter() {
		return lisPresenter;
	}

}
