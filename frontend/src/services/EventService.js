import axios from "axios";

const EVENT_API_BASE_URL = "http://localhost:8080/api/events";

class EventService {
  getEvents() {
    return axios.get(EVENT_API_BASE_URL);
  }
}

export default new EventService();
