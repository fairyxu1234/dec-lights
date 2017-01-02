package com.wenwen.cms.entity;

/**
 * 配置对象
 * <p/>
 *
 */
public class ConfigHistory extends Config {
	private long configId;

	public long getConfigId() {
		return configId;
	}

	public void setConfigId(long configId) {
		this.configId = configId;
	}

	public void copy(Config old) {
		this.setVersion(old.getVersion());
		this.setName(old.getName());
		this.setProfile(old.getProfile());
		this.setPath(old.getPath());
		this.setContent(old.getContent());
		this.setEditor(old.getEditor());
		this.setModifyTime(old.getModifyTime());
		this.setConfigId(old.getId());
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("ConfigHistory{");
		sb.append("name=").append(getName()).append(',');
		sb.append("profile=").append(getProfile()).append(',');
		sb.append("version=").append(getVersion());
		sb.append('}');
		return sb.toString();
	}
}
