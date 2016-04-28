package com.mis.ins.scan;

import java.util.List;

import com.mis.ins.check.DouyuTV;
import com.mis.ins.check.PandaTV;
import com.mis.ins.resource.Presenter;
import com.mis.ins.resource.Resource;


public class Control {

	public static void main(String[] args) {

		DouyuTV d = new DouyuTV();
		PandaTV p = new PandaTV();

		Resource r = new Resource();
		r.initPresenterList();
		List<Presenter> lisPresenter = r.getLisPresenter();

		for (Presenter presenter : lisPresenter) {

			if (presenter.getPlatform().equals("P")) {
				p.check(presenter);

			}
			if (presenter.getPlatform().equals("D")) {
				d.check(presenter);
			}

		}

		System.out.println();

	}

	public List<Presenter> getPresenterLis() {

		DouyuTV d = new DouyuTV();
		PandaTV p = new PandaTV();

		Resource r = new Resource();
		r.initPresenterList();
		List<Presenter> lisPresenter = r.getLisPresenter();

		for (Presenter presenter : lisPresenter) {

			if (presenter.getPlatform().equals("P")) {
				p.check(presenter);

			}
			if (presenter.getPlatform().equals("D")) {
				d.check(presenter);
			}

		}

		return lisPresenter;
	}

}
