/*
 *         DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
 *                     Version 2, December 2004
 *
 *  Copyright (C) 2004 Sam Hocevar <sam@hocevar.net>
 *
 *  Everyone is permitted to copy and distribute verbatim or modified
 *  copies of this license document, and changing it is allowed as long
 *  as the name is changed.
 *
 *             DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
 *    TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION
 *
 *   0. You just DO WHAT THE FUCK YOU WANT TO.
 */

package bio.discord.dbio.entities.connections;

import com.google.gson.JsonObject;

/**
 * Java class representing the connections a user has on their linked Discord account.
 *
 * @author zastrixarundell
 * @version 0.0.0
 */
public class DiscordConnection
{

    private String connectionType;
    private int id;
    private String name, url, icon;

    public DiscordConnection(JsonObject payload)
    {
        id = payload.get("id").getAsInt();
        connectionType = payload.get("connection_type").getAsString();
        name = payload.get("name").getAsString();
        url = payload.get("url").getAsString();
        icon = payload.get("icon").getAsString();
    }

    /**
     * Deprecated method for getting the connection type. It will return a string now but
     * this will soon be changed to an Enum.
     * @return The connection type name.
     */
    @Deprecated
    public String getConnectionType()
    {
        return connectionType;
    }

    /**
     * The id of the connected account.
     * @return ID of the connected account.
     */
    public int getId()
    {
        return id;
    }

    /**
     * The name of the connected account.
     * @return String of the account name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * The url of the connected account.
     * @return String url of the connected account.
     */
    public String getUrl()
    {
        return url;
    }

    /**
     * The icon of the connection.
     * @return String name of the icon.
     */
    public String getIcon()
    {
        return icon;
    }

    @Override
    public String toString()
    {
        return "DiscordConnection{" +
                "connectionType='" + connectionType + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
